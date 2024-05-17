package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Badge;

@Service
public interface BadgeService {

    public int save(Badge badge);

    public List<Badge> getAll();

    public Badge get(int badge_id);

    public int delete(int badge_id);
}