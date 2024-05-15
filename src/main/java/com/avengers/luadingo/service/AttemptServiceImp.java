package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Attempt;
import com.avengers.luadingo.repository.AttemptRepository;

@Service
public class AttemptServiceImp implements AttemptService{
    
    @Autowired
    private  AttemptRepository attemptRepository;

    @Override
    public Attempt save(Attempt attempt) {
        return attemptRepository.save(attempt);
    }

    @Override
    public List<Attempt> getAll() {
        return attemptRepository.findAll();
         }

    @Override
    public Attempt get(String attempt_id) {
            return attemptRepository.getReferenceById(attempt_id);
    }

    @Override
    public void delete(String attempt_id) {
        attemptRepository.deleteById(attempt_id);
    }

}
