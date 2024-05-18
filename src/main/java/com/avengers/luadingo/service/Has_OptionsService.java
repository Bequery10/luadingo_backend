package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Has_Options;
import com.avengers.luadingo.model.Has_OptionsPK;

@Service
public interface Has_OptionsService {

    List<Has_OptionsPK> findAll();

    List<Has_OptionsPK> getChoices(int question_id);

    int save(int question_id, String option);

    int delete(int question_id, String option);
}