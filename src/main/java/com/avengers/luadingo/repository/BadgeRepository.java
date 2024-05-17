package com.avengers.luadingo.repository;

import java.util.List;
import com.avengers.luadingo.model.Badge;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BadgeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Badge> findAll() {
        String sql = "SELECT * FROM Badge";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Badge.class));
    }

    public Badge getReferenceById(int id) {
        String sql = "SELECT * FROM Badge b WHERE b.badge_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Badge.class), id);
    }

    public int save(Badge badge) {
        int id = badge.getBadge_id();
        String name = badge.getBadge_name();
        String desc = badge.getBadge_desc();
        String imageUrl = badge.getBadge_image_url();
        String sql = "INSERT INTO Badge (badge_id, badge_name, badge_desc, badge_image_url) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, id, name, desc, imageUrl);
    }

    public int deleteById(int id) {
        String sql = "DELETE FROM Badge WHERE badge_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}