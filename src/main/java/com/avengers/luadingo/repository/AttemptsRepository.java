
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
            return earnBadge(username, quiz_id, attempt_id);

        else
            return 0;
    }

    public int delete(String username, int attempt_id, int quiz_id) {
        String sql = "DELETE FROM Attempts WHERE username = ? AND attempt_id = ? AND quiz_id = ?";
        return jdbcTemplate.update(sql, username, attempt_id, quiz_id);
    }

    public int earnBadge(String username, int quiz_id, int attempt_id) {

        String sql2 = "SELECT attempt_current from attempt where attempt_id = ?";
        int current = jdbcTemplate.queryForObject(sql2, Integer.class, attempt_id);

        if (current != 5)
            return 1;
        System.out.println("-----------------------------------------------------0----------------------------");
        String sql = "SELECT COUNT(*) FROM attempts atts JOIN attempt a ON atts.attempt_id = a.attempt_id JOIN has_quiz hq ON atts.quiz_id = hq.quiz_id WHERE atts.username = ? AND hq.course_id = (SELECT course_id FROM has_quiz WHERE quiz_id = ?) AND a.attempt_score = 500;";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, username, quiz_id);
        if (count == 2) {
            String sql1 = "INSERT INTO has_badge (username, badge_id) SELECT ?, badge.badge_id FROM badge JOIN course ON badge.badge_desc = course.course_language JOIN has_quiz ON course.course_id = has_quiz.course_id WHERE has_quiz.quiz_id = ? LIMIT 1;";
            jdbcTemplate.update(sql1, username, quiz_id);
            return 2;
        } else if (count == 5) {
            String sql1 = "INSERT INTO has_badge (username, badge_id) SELECT ?, badge.badge_id FROM badge JOIN course ON badge.badge_desc = course.course_language JOIN has_quiz ON course.course_id = has_quiz.course_id WHERE has_quiz.quiz_id = ? LIMIT 1,1;";
            jdbcTemplate.update(sql1, username, quiz_id);

            return 3;
        }

        return 1;
    }
}
