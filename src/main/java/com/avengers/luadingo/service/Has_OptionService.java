package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Has_Option;
import com.avengers.luadingo.model.Has_OptionPK;
import com.avengers.luadingo.repository.Has_OptionRepository;

@Service
public interface Has_OptionService {

    public int save(Has_Option has_option);

    public List<Has_Option> getAll();

    public Has_Option get(Has_OptionPK option);

    public int delete(Has_OptionPK option);
}