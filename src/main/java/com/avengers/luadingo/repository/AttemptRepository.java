
package com.avengers.luadingo.repository;

import java.util.List;
import com.avengers.luadingo.model.Attempt;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AttemptRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Attempt> findAll() {
        String sql = "SELECT * FROM Attempt";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Attempt.class));
    }

    public Attempt getReferenceById(int id) {
        String sql = "SELECT * FROM Attempt a WHERE a.attempt_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Attempt.class), id);
    }

    public Attempt save(Attempt attempt) {
        int current = attempt.getAttempt_current();
        int score = attempt.getAttempt_score();
        int id = getCount() + 1;
        String sql = "INSERT INTO Attempt (attempt_id, attempt_current, attempt_score) VALUES ( ?, ?, ?)";
        jdbcTemplate.update(sql, id, current, score);

        return getReferenceById(id);
    }

    public int deleteById(int id) {
        String sql = "DELETE FROM Attempt WHERE attempt_id = ?";
        return jdbcTemplate.update(sql, id);
    }

    public int getCount() {
        String sql = "SELECT COUNT(*) FROM Attempt";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}