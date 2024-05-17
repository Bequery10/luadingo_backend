package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Question;

public interface QuestionService {

    public int save(Question quiz);

    public List<Question> getAll();

    public Question get(int question_id);

    public int delete(int question_id);
}