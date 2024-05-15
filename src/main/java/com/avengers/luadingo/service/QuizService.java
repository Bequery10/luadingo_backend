package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

import com.avengers.luadingo.model.Quiz;

public interface QuizService {
    
    public Quiz save(Quiz quiz);
    public List<Quiz> getAll();
    public Quiz get(int quiz_id);
    public void delete(int quiz_id);
}
