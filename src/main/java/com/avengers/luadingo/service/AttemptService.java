package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Attempt;

public interface AttemptService {
    
    public Attempt save(Attempt attempt);
    public List<Attempt> getAll();
    public Attempt get(String attempt_id);
    public void delete(String attempt_id);
}
