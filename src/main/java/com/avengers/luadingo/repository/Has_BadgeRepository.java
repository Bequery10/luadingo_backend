package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Has_Badge;
import com.avengers.luadingo.model.Has_BadgePK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Has_BadgeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Has_Badge> findAll() {
        String sql = "SELECT * FROM Has_Badge";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_Badge.class));
    }

    public Has_Badge getReferenceById(Has_BadgePK id) {
        String sql = "SELECT * FROM Has_Badge h WHERE h.id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Has_Badge.class), id);
    }

    public int save(Has_Badge hasBadge) {
        Has_BadgePK id = hasBadge.getId();
        String sql = "INSERT INTO Has_Badge (id) VALUES (?)";
        return jdbcTemplate.update(sql, id);
    }

    public int deleteById(Has_BadgePK id) {
        String sql = "DELETE FROM Has_Badge WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}