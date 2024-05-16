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
    public Has_Badge save(Has_Badge has_badge) {
        return has_badgeRepository.save(has_badge);
    }

    @Override
    public List<Has_Badge> getAll() {
        return has_badgeRepository.findAll();
    }

    @Override
    public Has_Badge get(Has_BadgePK id) {
        return has_badgeRepository.getReferenceById(id);
    }

    @Override
    public void delete(Has_BadgePK id) {
        has_badgeRepository.deleteById(id);
    }

}