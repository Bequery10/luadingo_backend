package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Has_Option;
import com.avengers.luadingo.repository.Has_OptionRepository;

@Service
public class Has_OptionServiceImp implements Has_OptionService{

    @Autowired
    private  Has_OptionRepository has_optionRepository;
    
    @Override
    public Has_Option save(Has_Option has_option) {
        return has_optionRepository.save(has_option);
    }

    @Override
    public List<Has_Option> getAll() {
        return has_optionRepository.findAll();
         }

    @Override
    public Has_Option get(String option) {
            return has_optionRepository.getReferenceById(option);
    }

    @Override
    public void delete(String option) {
        has_optionRepository.deleteById(option);
    }
    
}