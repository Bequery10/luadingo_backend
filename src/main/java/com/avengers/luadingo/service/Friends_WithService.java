package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import com.avengers.luadingo.repository.Friends_WithRepository;

@Service
public interface Friends_WithService {

    public Friends_With save(Friends_With friendsWith);

    public List<Friends_With> getAll();

    public Friends_With get(Friends_WithPK id);

    public void delete(Friends_WithPK id);
}