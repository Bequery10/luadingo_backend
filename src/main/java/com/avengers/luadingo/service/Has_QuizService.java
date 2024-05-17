package com.avengers.luadingo.service;

import java.util.List;
import com.avengers.luadingo.model.Has_Quiz;
import com.avengers.luadingo.model.Has_QuizPK;

public interface Has_QuizService {
    int save(Has_Quiz has_quiz);

    List<Has_Quiz> getAll();

    Has_Quiz get(Has_QuizPK id);

    int delete(Has_QuizPK id);
}