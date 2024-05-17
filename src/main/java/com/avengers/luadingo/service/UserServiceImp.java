package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.User;
import com.avengers.luadingo.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public int save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User get(String username) {
        return userRepository.getReferenceById(username);
    }

    @Override
    public int delete(String username) {
        return userRepository.deleteById(username);
    }

    @Override
    public boolean isExist(String username, String password) {
        return userRepository.isExist(username, password);
    }

    @Override
    public int update(String newUsername, String newPassword, String oldUsername) {
        return userRepository.update(newUsername, newPassword, oldUsername);
    }

}
