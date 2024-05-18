package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.Has_Badge;
import com.avengers.luadingo.model.Has_BadgePK;
import com.avengers.luadingo.repository.Has_BadgeRepository;

@Service
public interface Has_BadgeService {

    List<Has_BadgePK> findAll();

    List<Has_BadgePK> getUserBadges(String username);

    int getUserBadgesCount(String username);

    int add(String username, int badge_id);

    int deleteById(String username);
}