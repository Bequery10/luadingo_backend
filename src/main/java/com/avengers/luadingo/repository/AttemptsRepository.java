
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

    public List<Attempts> findAll() {
        String sql = "SELECT * FROM Attempts";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Attempts.class));
    }

    public Attempts getReferenceById(AttemptsPK id) {
        String sql = "SELECT * FROM Attempts a WHERE a.id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Attempts.class), id);
    }

    public int save(Attempts attempts) {
        AttemptsPK id = attempts.getId();
        String sql = "INSERT INTO Attempts (id) VALUES (?)";
        return jdbcTemplate.update(sql, id);
    }

    public int deleteById(AttemptsPK id) {
        String sql = "DELETE FROM Attempts WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}