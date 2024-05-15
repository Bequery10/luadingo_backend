package com.avengers.luadingo.service;

import java.util.List;

import org.hibernate.resource.beans.container.internal.NoSuchBeanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avengers.luadingo.model.User;
import com.avengers.luadingo.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private  UserRepository userRepository;
    
    @Override
    public User save(User user) {
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
    public void delete(String username) {
        userRepository.deleteById(username);
    }
    
}
