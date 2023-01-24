package com.example.provider.service.impl;

import com.example.provider.pojo.User;
import com.example.provider.repository.UserRepository;
import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
    @Override
    @Transactional
    public User insertUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void deleteAllUser() {
        this.repository.deleteAll();
    }
}
