package com.avengers.luadingo.service;

import java.util.List;
import com.avengers.luadingo.model.Has_Quiz;
import com.avengers.luadingo.model.Has_QuizPK;

public interface Has_QuizService {
    int save(int quiz_id, int course_id);

    List<Has_QuizPK> findAll();

    Has_QuizPK getCourse(int quiz_id);

    List<Has_Quiz> getQuizzes(int course_id);

    int deleteById(int quiz_id, int course_id);
}