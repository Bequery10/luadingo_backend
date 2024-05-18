package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Attempt;
import com.avengers.luadingo.model.AttemptsPK;

public interface AttemptsService {

    List<AttemptsPK> findAll();

    List<AttemptsPK> getUserAttempts(String username);

    List<AttemptsPK> getUserAttemptsForQuiz(String username, int quiz_id);

    int save(String username, int attempt_id, int quiz_id);

    int delete(String username, int attempt_id, int quiz_id);

}
