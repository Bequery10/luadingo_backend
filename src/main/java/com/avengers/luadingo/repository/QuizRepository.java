package com.avengers.luadingo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.avengers.luadingo.model.Quiz;
import com.avengers.luadingo.model.User;

@Repository
public class QuizRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Quiz> findAll() {
        String sql = "SELECT * FROM Quiz";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Quiz.class));
    }

    public Quiz getReferenceById(int quizId) {
        String sql = "SELECT * FROM Quiz q WHERE q.quizId = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Quiz.class), quizId);
    }

    public int save(Quiz quiz) {
        int quiz_id = quiz.getQuiz_id();
        String quiz_title = quiz.getQuiz_title();
        String sql = "INSERT INTO Quiz (quizId, quiz_title) VALUES (?, ?)";
        return jdbcTemplate.update(sql, quiz_id, quiz_title);
    }

    public int deleteById(int quiz_id) {
        String sql = "DELETE FROM Quiz WHERE quiz_id = ?";
        return jdbcTemplate.update(sql, quiz_id);
    }

}