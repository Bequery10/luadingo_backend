package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Has_Badge;
import com.avengers.luadingo.model.Has_BadgePK;
import com.avengers.luadingo.repository.Has_BadgeRepository;

@Service
public interface Has_BadgeService {

    public Has_Badge save(Has_Badge has_badge);

    public List<Has_Badge> getAll();

    public Has_Badge get(Has_BadgePK id);

    public void delete(Has_BadgePK id);
}