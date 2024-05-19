package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SqlCommandService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> executeSqlCommand(String sql) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (sql.trim().toLowerCase().startsWith("select")) {
                List<Map<String, Object>> queryResult = jdbcTemplate.queryForList(sql);
                result.put("result", queryResult);
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
