package com.avengers.luadingo.repository;

import java.util.List;
import com.avengers.luadingo.model.Has_Quiz;
import com.avengers.luadingo.model.Has_QuizPK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Has_QuizRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Has_QuizPK> findAll() {
        String sql = "SELECT quiz_id,course_id FROM Has_Quiz";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_QuizPK.class));
    }

    public Has_QuizPK getCourse(int quiz_id) {
        String sql = "SELECT course_id FROM Has_Quiz WHERE quiz_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Has_QuizPK.class), quiz_id);
    }

    public List<Has_QuizPK> getQuizzes(int course_id) {
        String sql = "SELECT * FROM Has_Quiz  WHERE course_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_QuizPK.class), course_id);
    }

    public int save(int quiz_id, int course_id) {
        String sql = "INSERT INTO Has_Quiz quiz_id,course_id VALUES (?,?)";
        return jdbcTemplate.update(sql, quiz_id, course_id);
    }

    public int deleteById(int quiz_id, int course_id) {
        String sql = "DELETE FROM Has_Quiz WHERE quiz_id = ? AND course_id= ?";
        return jdbcTemplate.update(sql, quiz_id, course_id);
    }
}