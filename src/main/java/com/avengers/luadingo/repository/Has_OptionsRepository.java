package com.avengers.luadingo.repository;

import java.util.List;

import com.avengers.luadingo.model.Has_Options;
import com.avengers.luadingo.model.Has_OptionsPK;
import com.avengers.luadingo.model.Has_OptionsPK;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Has_OptionsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Has_OptionsPK> findAll() {
        String sql = "SELECT choice FROM Has_Options";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_OptionsPK.class));
    }

    public List<Has_OptionsPK> getChoices(int question_id) {
        String sql = "SELECT choice FROM Has_Options WHERE question_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Has_OptionsPK.class), question_id);
    }

    public int save(int question_id, String option) {
        String sql = "INSERT INTO Has_Options question_id,option VALUES (?,?)";
        return jdbcTemplate.update(sql, question_id, option);
    }

    public int delete(int question_id, String option) {
        String sql = "DELETE FROM Has_Options WHERE question_id = ? AND option= ?";
        return jdbcTemplate.update(sql, question_id, option);
    }
}