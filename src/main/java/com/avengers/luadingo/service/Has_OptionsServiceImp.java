package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Has_Options;
import com.avengers.luadingo.model.Has_OptionsPK;
import com.avengers.luadingo.repository.Has_OptionsRepository;

@Service
public class Has_OptionsServiceImp implements Has_OptionsService {

    @Autowired
    private Has_OptionsRepository hasOptionsRepository;

    @Override
    public List<Has_OptionsPK> findAll() {
        return hasOptionsRepository.findAll();
    }

    @Override
    public List<Has_OptionsPK> getChoices(int question_id) {
        return hasOptionsRepository.getChoices(question_id);
    }

    @Override
    public int save(int question_id, String option) {
        return hasOptionsRepository.save(question_id, option);
    }

    @Override
    public int delete(int question_id, String option) {
        return hasOptionsRepository.delete(question_id, option);
    }

}