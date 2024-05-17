package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.Badge;
import com.avengers.luadingo.repository.BadgeRepository;

@Service
public class BadgeServiceImp implements BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    @Override
    public int save(Badge badge) {
        return badgeRepository.save(badge);
    }

    @Override
    public List<Badge> getAll() {
        return badgeRepository.findAll();
    }

    @Override
    public Badge get(int badge_id) {
        return badgeRepository.getReferenceById(badge_id);
    }

    @Override
    public int delete(int badge_id) {
        return badgeRepository.deleteById(badge_id);
    }

}