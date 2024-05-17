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

    public List<Friends_With> getReferenceById(String username) {

        String sql = "SELECT * FROM Friends_With f WHERE (f.username1 = ? OR f.username2 = ?) AND status = 'Accepted'";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Friends_With.class), username, username);
    }

    public int save(Friends_With friendsWith) {
        Friends_WithPK id = friendsWith.getId();
        String username1 = id.getUsername1();
        String username2 = id.getUsername2();

        // String sql = "CALL AddFriend(?,?,@output); SELECT @output;";
        String sql = "INSERT INTO Friends_With (username1, username2) VALUES (?, ?)";
        return jdbcTemplate.update(sql, username1, username2);
    }

    public int deleteById(Friends_WithPK id) {
        String sql = "DELETE FROM Friends_With WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}