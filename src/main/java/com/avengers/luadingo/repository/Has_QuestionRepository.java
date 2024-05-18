package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;
import com.avengers.luadingo.model.Has_QuestionPK;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Has_QuestionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Has_QuestionPK> findAll() {
        String sql = "SELECT question_id,quiz_id FROM Has_question";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_QuestionPK.class));
    }

    public Has_QuestionPK getquiz(int question_id) {
        String sql = "SELECT quiz_id FROM Has_question WHERE question_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Has_QuestionPK.class), question_id);
    }

    public List<Has_QuestionPK> getquestionzes(int quiz_id) {
        String sql = "SELECT question_id FROM Has_question  WHERE quiz_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_QuestionPK.class), quiz_id);
    }

    public int save(int question_id, int quiz_id) {
        String sql = "INSERT INTO Has_question question_id,quiz_id VALUES (?,?)";
        return jdbcTemplate.update(sql, question_id, quiz_id);
    }

    public int deleteById(int question_id, int quiz_id) {
        String sql = "DELETE FROM Has_question WHERE question_id = ? AND quiz_id= ?";
        return jdbcTemplate.update(sql, question_id, quiz_id);
    }
}