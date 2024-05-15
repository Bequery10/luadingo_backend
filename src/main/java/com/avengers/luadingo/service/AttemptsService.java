package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Attempts;
import com.avengers.luadingo.repository.AttemptsRepository;

@Service
public interface AttemptsService {
    
    public Attempts save(Attempts attempt);
    public List<Attempts> getAll();
    public Attempts get(int attempt_id);
    public void delete(int attempt_id);
}