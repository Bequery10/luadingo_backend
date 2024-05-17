package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Question;
import com.avengers.luadingo.repository.QuestionRepository;

@Service
public class QuestionServiceImp implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public int save(Question quiz) {
        return questionRepository.save(quiz);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question get(int question_id) {
        return questionRepository.getReferenceById(question_id);
    }

    @Override
    public int delete(int question_id) {
        return questionRepository.deleteById(question_id);
    }

}
