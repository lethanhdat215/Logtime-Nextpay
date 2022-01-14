package com.example.emaillogtime.service.impl;

import com.example.emaillogtime.dto.UserDTO;
import com.example.emaillogtime.entity.User;
import com.example.emaillogtime.reposiotry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements com.example.emaillogtime.service.UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDTO userDTO) {
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setMail(userDTO.getMail());
        return userRepository.save(user);
    }
}
