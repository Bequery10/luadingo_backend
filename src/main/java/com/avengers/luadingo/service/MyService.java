package com.avengers.luadingo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import com.avengers.luadingo.model.User;

public interface MyService {
    
    public User save(User user);
    public List<User> getAllUsers();
    public User get(String username);
    public void delete(String username);
}
