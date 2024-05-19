package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Badge;
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

    public List<Has_BadgePK> findAll() {
        String sql = "SELECT * FROM Has_Badge";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_BadgePK.class));
    }

    public List<Badge> getUserBadges(String username) {
        String sql = "SELECT * FROM badge AS b, has_badge AS hb WHERE b.badge_id = hb.badge_id AND hb.username = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Badge.class), username);
    }

    public int getUserBadgesCount(String username) {
        String sql = "SELECT COUNT(*) FROM badge AS b, has_badge AS hb WHERE b.badge_id = hb.badge_id AND hb.username = ?;";
        return jdbcTemplate.queryForObject(sql, Integer.class, username);
    }

    public int add(String username, int badge_id) {
        String sql = "INSERT INTO Has_Badge username, badge_id VALUES username,badge_id";
        return jdbcTemplate.update(sql, username, badge_id);
    }

    public int deleteById(String username) {
        String sql = "DELETE FROM Has_Badge WHERE uesrname = ?";
        return jdbcTemplate.update(sql, username);
    }
}