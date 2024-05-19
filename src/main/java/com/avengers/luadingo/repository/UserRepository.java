package com.avengers.luadingo.repository;

import com.avengers.luadingo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public int update(String newUsername, String newPassword, String oldUsername) {
        String sql = "UPDATE User SET username = ?, password = ? WHERE username = ?";
        return jdbcTemplate.update(sql, newUsername, newPassword, oldUsername);
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

    public List<User> sortByBadgeCount() {
        String countSql = "(SELECT COUNT(*) FROM Has_Badge WHERE Has_Badge.username = User.username)";
        String sql = "SELECT * FROM User ORDER BY " + countSql;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    public Map<String, Object> executeSqlCommand(String sql) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (sql.trim().toLowerCase().startsWith("select")) {
                result.put("result", jdbcTemplate.queryForList(sql));
            } else {
                int updateCount = jdbcTemplate.update(sql);
                result.put("result", updateCount + " row(s) affected.");
            }
        } catch (Exception e) {
            result.put("error", e.getMessage());
        }
        return result;
    }
}
