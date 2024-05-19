package com.avengers.luadingo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Has_Quiz;
import com.avengers.luadingo.model.Has_QuizPK;
import com.avengers.luadingo.repository.Has_QuizRepository;

@Service
public class Has_QuizServiceImp implements Has_QuizService {

    @Autowired
    private Has_QuizRepository has_quizRepository;

    @Override
    public int save(int quiz_id, int course_id) {

        return has_quizRepository.save(quiz_id, course_id);
    }

    @Override
    public List<Has_QuizPK> findAll() {
        return has_quizRepository.findAll();
    }

    @Override
    public Has_QuizPK getCourse(int quiz_id) {
        return has_quizRepository.getCourse(quiz_id);
    }

    @Override
    public List<Has_Quiz> getQuizzes(int course_id) {
        return has_quizRepository.getQuizzes(course_id);
    }

    @Override
    public int deleteById(int quiz_id, int course_id) {
        has_quizRepository.deleteById(quiz_id, course_id);
        return 1;
    }
}