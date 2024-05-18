package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Attempts;
import com.avengers.luadingo.model.AttemptsPK;
import com.avengers.luadingo.repository.AttemptsRepository;

@Service
public class AttemptsServiceImp implements AttemptsService {

    @Autowired
    private AttemptsRepository attemptsRepository;

    @Override
    public List<AttemptsPK> findAll() {
        return attemptsRepository.findAll();
    }

    @Override
    public List<AttemptsPK> getUserAttempts(String username) {
        return attemptsRepository.getUserAttempts(username);
    }

    @Override
    public List<AttemptsPK> getUserAttemptsForQuiz(String username, int quiz_id) {
        return attemptsRepository.getUserAttemptsForQuiz(username, quiz_id);
    }

    @Override
    public int save(String username, int attempt_id, int quiz_id) {
        return attemptsRepository.save(username, attempt_id, quiz_id);
    }

    @Override
    public int delete(String username, int attempt_id, int quiz_id) {
        return attemptsRepository.delete(username, attempt_id, quiz_id);
    }
}