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
    public int save(Has_Quiz has_quiz) {
        return has_quizRepository.save(has_quiz);
    }

    @Override
    public List<Has_Quiz> getAll() {
        return has_quizRepository.findAll();
    }

    @Override
    public Has_Quiz get(Has_QuizPK id) {
        return has_quizRepository.getReferenceById(id);
    }

    @Override
    public int delete(Has_QuizPK id) {
        return has_quizRepository.deleteById(id);
    }
}