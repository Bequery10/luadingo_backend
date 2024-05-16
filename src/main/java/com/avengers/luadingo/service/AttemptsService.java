package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Attempts;
import com.avengers.luadingo.model.AttemptsPK;

@Service
public interface AttemptsService {

    public Attempts save(Attempts attempt);

    public List<Attempts> getAll();

    public Attempts get(AttemptsPK attempt_id);

    public void delete(AttemptsPK attempt_id);
}