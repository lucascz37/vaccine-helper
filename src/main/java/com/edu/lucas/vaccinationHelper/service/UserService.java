package com.edu.lucas.vaccinationHelper.service;
/*
@author: Lucas Andrade
@Created_at: 26/02/2021, sex
*/

import com.edu.lucas.vaccinationHelper.model.User;
import com.edu.lucas.vaccinationHelper.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User findByEmail(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElse(null);
    }
}
