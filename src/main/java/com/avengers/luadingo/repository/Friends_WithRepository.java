package com.avengers.luadingo.repository;

import java.util.ArrayList;
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

    public List<Friends_WithPK> findAll() {
        String sql = "SELECT username1, username2 FROM Friends_With";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Friends_WithPK.class));
    }

    public List<Friends_WithPK> getFriends(String username) {

        String sql = "SELECT username1 FROM Friends_With f WHERE f.username2 = ? AND status = 'Accepted' " +
                "UNION " +
                "SELECT username2 FROM Friends_With f WHERE f.username1 = ? AND status = 'Accepted'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Friends_WithPK.class), username, username);
    }

    public Friends_With getFriendShip(String username1, String username2) {

        String sql = "SELECT * FROM Friends_With WHERE ( username1 = ? AND username2 = ? ) OR ( username1 = ? AND username2 = ? )";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Friends_With.class), username1, username2);
    }

    public int save(Friends_With friendsWith) {
        Friends_WithPK id = friendsWith.getId();
        String username1 = id.getUsername1();
        String username2 = id.getUsername2();

        String sql = "INSERT INTO Friends_With (username1, username2) VALUES (?, ?)";
        return jdbcTemplate.update(sql, username1, username2);
    }

    public int addFriend(String username1, String username2) {
        String sql = "INSERT INTO Friends_With (username1, username2) VALUES (?, ?)";
        return jdbcTemplate.update(sql, username1, username2);
    }

    public int accept(String username1, String username2) {
        String sql = "UPDATE Friends_With SET Status = 'Accepted' WHERE username1 = ? AND username2 = ?";
        return jdbcTemplate.update(sql, username2, username1);
    }

    public int deleteById(String username1, String username2) {

        String sql = "DELETE FROM Friends_With WHERE username1= ? AND username2 = ?";
        return jdbcTemplate.update(sql, username1, username2);
    }

    public List<Friends_WithPK> getRequests(String username) {
        String sql = "SELECT username1 FROM Friends_With f WHERE f.username2 = ? AND status = 'Pending'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Friends_WithPK.class), username);
    }

}