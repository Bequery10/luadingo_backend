package com.avengers.luadingo.repository;

import com.avengers.luadingo.model.Question;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Question> findAll() {
        String sql = "SELECT * FROM Question";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Question.class));
    }

    public Question getReferenceById(int questionId) {
        String sql = "SELECT * FROM Question q WHERE q.question_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Question.class), questionId);
    }

    public int save(Question question) {
        int questionId = question.getQuestion_id();
        String questionText = question.getQuestion_text();
        String questionType = question.getQuestion_type();
        String questionAnswer = question.getQuestion_answer();
        String sql = "INSERT INTO Question (question_id, question_text, question_type, question_answer) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, questionId, questionText, questionType, questionAnswer);
    }

    public int deleteById(int questionId) {
        String sql = "DELETE FROM Question WHERE question_id = ?";
        return jdbcTemplate.update(sql, questionId);
    }
}