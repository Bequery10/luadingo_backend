package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;
import com.avengers.luadingo.repository.Has_QuestionRepository;

@Service
public class Has_QuestionServiceImp implements Has_QuestionService {

    @Autowired
    private Has_QuestionRepository has_questionRepository;

    @Override
    public int save(Has_Question has_question) {
        return has_questionRepository.save(has_question);
    }

    @Override
    public List<Has_Question> getAll() {
        return has_questionRepository.findAll();
    }

    @Override
    public Has_Question get(Has_QuestionPK id) {
        return has_questionRepository.getReferenceById(id);
    }

    @Override
    public int delete(Has_QuestionPK id) {
        return has_questionRepository.deleteById(id);
    }
}