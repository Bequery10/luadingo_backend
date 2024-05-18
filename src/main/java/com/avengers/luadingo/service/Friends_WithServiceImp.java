package com.avengers.luadingo.service;

import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import com.avengers.luadingo.repository.Friends_WithRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Friends_WithServiceImp implements Friends_WithService {

    @Autowired
    private Friends_WithRepository friendsWithRepository;

    @Override
    public List<Friends_WithPK> getAll() {
        return friendsWithRepository.findAll();
    }

    @Override
    public List<Friends_WithPK> getFriends(String username) {
        return friendsWithRepository.getFriends(username);
    }

    @Override
    public Friends_With getFriendShip(String username1, String username2) {
        return friendsWithRepository.getFriendShip(username1, username2);
    }

    @Override
    public int save(Friends_With friendsWith) {
        return friendsWithRepository.save(friendsWith);
    }

    @Override
    public int accept(String username1, String username2) {
        return friendsWithRepository.accept(username1, username2);
    }

    @Override
    public int deleteById(String username1, String username2) {
        return friendsWithRepository.deleteById(username1, username2);
    }

    @Override
    public int addFriend(String username1, String username2) {
        return friendsWithRepository.addFriend(username1, username2);
    }

    @Override
    public List<Friends_WithPK> getRequests(String username1) {
        return friendsWithRepository.getRequests(username1);
    }
}