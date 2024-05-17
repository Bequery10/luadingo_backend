package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Course;
import com.avengers.luadingo.repository.CourseRepository;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public int save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course get(int course_id) {
        return courseRepository.getReferenceById(course_id);
    }

    @Override
    public int delete(int course_id) {
        return courseRepository.deleteById(course_id);
    }

}