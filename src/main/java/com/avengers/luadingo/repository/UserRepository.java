package com.avengers.luadingo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.avengers.luadingo.model.User;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // @Autowired
    // private JdbcTemplate jdbcTemplate;

    // public List<Map<String, Object>> get() {
    // return this.jdbcTemplate.queryForList(
    // ""
    // );
    // }

    // public int add(User user) {
    // String sql = "INSERT INTO user (username, password, email, level) VALUES (?,
    // ?, ?, ?)";
    // return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(),
    // user.getEmail(), user.getLevel());
    // }

    // public int update(User user) {
    // String sql = "UPDATE user SET password = ?, email = ?, level = ? WHERE
    // username = ?";
    // return jdbcTemplate.update(sql, user.getPassword(), user.getEmail(),
    // user.getLevel(), user.getUsername());
    // }

    // public int delete(String username) {
    // String sql = "DELETE FROM user WHERE username = ?";
    // return jdbcTemplate.update(sql, username);
    // }
}