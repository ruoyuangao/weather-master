package com.example.provider.service;

import com.example.provider.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User insertUser(User user);

    public List<User> getAllUser();

    public void deleteAllUser();
}
