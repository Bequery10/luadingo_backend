package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;
import com.avengers.luadingo.model.Question;
import com.avengers.luadingo.repository.Has_QuestionRepository;

@Service

public interface Has_QuestionService {

    int save(int question_id, int quiz_id);

    List<Has_QuestionPK> findAll();

    Has_QuestionPK getquiz(int question_id);

    List<Question> getquestionzes(int quiz_id);

    int deleteById(int question_id, int quiz_id);
}