
package com.avengers.luadingo.repository;

import java.util.List;
import com.avengers.luadingo.model.Attempts;
import com.avengers.luadingo.model.AttemptsPK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AttemptsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<AttemptsPK> findAll() {
        String sql = "SELECT * FROM Attempts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AttemptsPK.class));
    }

    public List<AttemptsPK> getUserAttempts(String username) {
        String sql = "SELECT  quiz_id , attempt_id FROM Attempts WHERE username = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AttemptsPK.class), username);
    }

    public List<AttemptsPK> getUserAttemptsForQuiz(String username, int quiz_id) {
        String sql = "SELECT attempt_id FROM Attempts WHERE username = ? AND quiz_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AttemptsPK.class), username, quiz_id);
    }

    public int save(String username, int attempt_id, int quiz_id) {
        String sql = "INSERT INTO Attempts (username,attempt_id,quiz_id) VALUES (?,?,?)";

        int num = jdbcTemplate.update(sql, username, attempt_id, quiz_id);

        if (num == 1)
            return earnBadge(username, quiz_id);

        else
            return 0;
    }

    public int delete(String username, int attempt_id, int quiz_id) {
        String sql = "DELETE FROM Attempts WHERE username = ? AND attempt_id = ? AND quiz_id = ?";
        return jdbcTemplate.update(sql, username, attempt_id, quiz_id);
    }

    public int earnBadge(String username, int quiz_id) {
        String sql = "SELECT COUNT(*) FROM attempts a JOIN has_quiz q ON a.quiz_id = q.quiz_id WHERE a.username = ? AND a.quiz_id = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, username, quiz_id);
        if (count == 5) {
            String sql1 = "SELECT b.badge_id " + //
                    "FROM has_course AS hc, badge AS b, course AS c " + //
                    "WHERE hc.quiz_id = ? AND hc.course_id = c.course_id AND c.language = b.desc;";
            jdbcTemplate.update(sql1, quiz_id);
            return 2;
        } else if (count == 10) {
            String sql1 = "SELECT b.badge_id " + //
                    "FROM has_course AS hc, badge AS b, course AS c " + //
                    "WHERE hc.quiz_id = ? AND hc.course_id = c.course_id AND c.language = b.desc;";
            jdbcTemplate.update(sql1, quiz_id);
            return 3;
        }
        return 1;
    }
}
