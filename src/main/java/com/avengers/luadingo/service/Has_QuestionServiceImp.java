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
    public int save(int question_id, int quiz_id) {
        return has_questionRepository.save(question_id, quiz_id);
    }

    @Override
    public List<Has_QuestionPK> findAll() {
        // TODO Auto-generated method stub
        return has_questionRepository.findAll();
    }

    @Override
    public Has_QuestionPK getquiz(int question_id) {
        // TODO Auto-generated method stub
        return has_questionRepository.getquiz(question_id);
    }

    @Override
    public List<Has_QuestionPK> getquestionzes(int quiz_id) {
        // TODO Auto-generated method stub
        return has_questionRepository.getquestionzes(quiz_id);
    }

    @Override
    public int deleteById(int question_id, int quiz_id) {
        // TODO Auto-generated method stub
        return has_questionRepository.deleteById(question_id, quiz_id);
    }

}