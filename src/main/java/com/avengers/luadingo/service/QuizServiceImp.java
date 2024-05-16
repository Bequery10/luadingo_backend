package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Quiz;
import com.avengers.luadingo.repository.QuizRepository;

@Service
public class QuizServiceImp implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(int quiz_id) {
        return quizRepository.getReferenceById(quiz_id);
    }

    @Override
    public void delete(int quiz_id) {
        quizRepository.deleteById(quiz_id);
    }

}