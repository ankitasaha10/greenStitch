package com.example.greenStitch1.service;

import com.example.greenStitch1.dto.UserInfoDto;
import com.example.greenStitch1.entity.UserInfo;
import com.example.greenStitch1.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {



    @Autowired
    private UserInfoDto userInfoDto;
    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserInfoDto getInfoOfUserByName(String name) throws Exception {
        Optional<UserInfo> userInfo = repository.findByName(name);
        UserInfoDto userInfoDto = new UserInfoDto();

        if (userInfo.isPresent()) {
            UserInfo user = userInfo.get();
            userInfoDto.setName(user.getName());
            userInfoDto.setEmail(user.getEmail());
            userInfoDto.setAge(user.getAge());
            userInfoDto.setAddress(user.getAddress());
            userInfoDto.setGender(user.getGender());
        }

        return userInfoDto;
    }

    public String addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system ";
    }
}

