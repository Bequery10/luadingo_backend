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
    public Attempts save(Attempts attempt) {
        return attemptsRepository.save(attempt);
    }

    @Override
    public List<Attempts> getAll() {
        return attemptsRepository.findAll();
    }

    @Override
    public Attempts get(AttemptsPK attempt_id) {
        return attemptsRepository.getReferenceById(attempt_id);
    }

    @Override
    public void delete(AttemptsPK attempt_id) {
        attemptsRepository.deleteById(attempt_id);
    }

}