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

    public List<Has_Quiz> findAll() {
        String sql = "SELECT * FROM Has_Quiz";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_Quiz.class));
    }

    public Has_Quiz getReferenceById(Has_QuizPK id) {
        String sql = "SELECT * FROM Has_Quiz h WHERE h.id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Has_Quiz.class), id);
    }

    public int save(Has_Quiz hasQuiz) {
        Has_QuizPK id = hasQuiz.getId();
        String sql = "INSERT INTO Has_Quiz (id) VALUES (?)";
        return jdbcTemplate.update(sql, id);
    }

    public int deleteById(Has_QuizPK id) {
        String sql = "DELETE FROM Has_Quiz WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}