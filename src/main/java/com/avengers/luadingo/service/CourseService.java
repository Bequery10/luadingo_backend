package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Course;

public interface CourseService {
    
    public Course save(Course course);
    public List<Course> getAll();
    public Course get(int course_id);
    public void delete(int course_id);
}