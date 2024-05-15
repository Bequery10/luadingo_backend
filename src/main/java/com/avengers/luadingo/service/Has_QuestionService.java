package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.repository.Has_QuestionRepository;

@Service

public interface Has_QuestionService {
    
    public Has_Question save(Has_Question has_question);
    public List<Has_Question> getAll();
    public Has_Question get(String question);
    public void delete(String question);
}