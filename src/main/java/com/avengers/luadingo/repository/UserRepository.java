package com.avengers.luadingo.repository;

import com.avengers.luadingo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        String sql = "SELECT * FROM User";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    public User getReferenceById(String username) {
        String sql = "SELECT * FROM User u WHERE u.username = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username);
    }

    public int save(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String sql = "INSERT INTO User (username, password, email) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, username, password, email);
    }

    public int deleteById(String username) {
        String sql = "DELETE FROM User WHERE username = ?";
        return jdbcTemplate.update(sql, username);
    }

    public boolean isExist(String username, String password) {
        String sql = "SELECT * FROM User u WHERE u.username = ? AND u.password = ?";
        try {
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), username, password);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }

}
