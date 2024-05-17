package com.avengers.luadingo.repository;

import java.util.List;
import com.avengers.luadingo.model.Course;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Course> findAll() {
        String sql = "SELECT * FROM Course";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Course.class));
    }

    public Course getReferenceById(int id) {
        String sql = "SELECT * FROM Course c WHERE c.course_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Course.class), id);
    }

    public int save(Course course) {
        int id = course.getCourse_id();
        String name = course.getCourse_name();
        String language = course.getCourse_language();
        String sql = "INSERT INTO Course (course_id, course_name, course_language) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, id, name, language);
    }

    public int deleteById(int id) {
        String sql = "DELETE FROM Course WHERE course_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}