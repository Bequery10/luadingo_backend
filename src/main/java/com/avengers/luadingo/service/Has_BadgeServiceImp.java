package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Has_Badge;
import com.avengers.luadingo.model.Has_BadgePK;
import com.avengers.luadingo.repository.Has_BadgeRepository;

@Service
public class Has_BadgeServiceImp implements Has_BadgeService {

    @Autowired
    private Has_BadgeRepository has_badgeRepository;

    @Override
    public List<Has_BadgePK> findAll() {
        return has_badgeRepository.findAll();
    }

    @Override
    public List<Has_BadgePK> getUserBadges(String username) {
        return has_badgeRepository.getUserBadges(username);
    }

    @Override
    public int getUserBadgesCount(String username) {
        return has_badgeRepository.getUserBadgesCount(username);
    }

    @Override
    public int add(String username, int badge_id) {
        return has_badgeRepository.add(username, badge_id);
    }

    @Override
    public int deleteById(String username) {
        return has_badgeRepository.deleteById(username);
    }

}