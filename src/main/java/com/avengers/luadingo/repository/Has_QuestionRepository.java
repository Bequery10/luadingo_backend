package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Has_QuestionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Has_Question> findAll() {
        String sql = "SELECT * FROM Has_Question";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_Question.class));
    }

    public Has_Question getReferenceById(Has_QuestionPK id) {
        String sql = "SELECT * FROM Has_Question h WHERE h.id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Has_Question.class), id);
    }

    public int save(Has_Question hasQuestion) {
        Has_QuestionPK id = hasQuestion.getId();
        String sql = "INSERT INTO Has_Question (id) VALUES (?)";
        return jdbcTemplate.update(sql, id);
    }

    public int deleteById(Has_QuestionPK id) {
        String sql = "DELETE FROM Has_Question WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}