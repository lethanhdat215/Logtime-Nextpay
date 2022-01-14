package com.example.emaillogtime.service;

import com.example.emaillogtime.dto.UserDTO;
import com.example.emaillogtime.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User save (UserDTO userDTO);
}

