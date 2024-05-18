package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.User;

public interface UserService {

    public int save(User user);

    public List<User> getAll();

    public List<User> sortByBadgeCount();

    public User get(String username);

    public int delete(String username);

    public int update(String newUsername, String newPassword, String olduserName);

    public boolean isExist(String username, String password);
}
