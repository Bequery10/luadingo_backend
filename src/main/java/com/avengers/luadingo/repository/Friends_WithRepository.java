package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Friends_WithRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Friends_With> findAll() {
        String sql = "SELECT * FROM Friends_With";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Friends_With.class));
    }

    public Friends_With getReferenceById(Friends_WithPK id) {
        String sql = "SELECT * FROM Friends_With f WHERE f.id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Friends_With.class), id);
    }

    public int save(Friends_With friendsWith) {
        Friends_WithPK id = friendsWith.getId();
        Friends_With.Status status = friendsWith.getStatus();
        String sql = "INSERT INTO Friends_With (id, status) VALUES (?, ?)";
        return jdbcTemplate.update(sql, id, status);
    }

    public int deleteById(Friends_WithPK id) {
        String sql = "DELETE FROM Friends_With WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}