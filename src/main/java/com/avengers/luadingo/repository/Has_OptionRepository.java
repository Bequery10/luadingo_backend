package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Has_Option;
import com.avengers.luadingo.model.Has_OptionPK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Has_OptionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Has_Option> findAll() {
        String sql = "SELECT * FROM Has_Option";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_Option.class));
    }

    public Has_Option getReferenceById(Has_OptionPK id) {
        String sql = "SELECT * FROM Has_Option h WHERE h.id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Has_Option.class), id);
    }

    public int save(Has_Option hasOption) {
        Has_OptionPK id = hasOption.getId();
        String sql = "INSERT INTO Has_Option (id) VALUES (?)";
        return jdbcTemplate.update(sql, id);
    }

    public int deleteById(Has_OptionPK id) {
        String sql = "DELETE FROM Has_Option WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}