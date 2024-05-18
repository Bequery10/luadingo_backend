package com.avengers.luadingo.service;

import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;

import java.util.List;

public interface Friends_WithService {
    List<Friends_WithPK> getAll();

    List<Friends_WithPK> getFriends(String username);

    Friends_With getFriendShip(String username1, String username2);

    int save(Friends_With friendsWith);

    int accept(String username1, String username2);

    int deleteById(String username1, String username2);

    int addFriend(String username1, String username2);

    List<Friends_WithPK> getRequests(String username1);
}