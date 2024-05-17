package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import com.avengers.luadingo.repository.Friends_WithRepository;

@Service
public class Friends_WithServiceImp implements Friends_WithService {

    @Autowired
    private Friends_WithRepository Friends_WithRepository;

    @Override
    public int save(Friends_With friendsWith) {
        return Friends_WithRepository.save(friendsWith);
    }

    @Override
    public List<Friends_With> getAll() {
        return Friends_WithRepository.findAll();
    }

    @Override
    public Friends_With get(String username) {
        return Friends_WithRepository.getReferenceById(username);
    }

    @Override
    public int delete(Friends_WithPK id) {
        return Friends_WithRepository.deleteById(id);
    }

}