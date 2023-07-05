package com.example.greenStitch1.controller;

import com.example.greenStitch1.dto.AuthRequest;
import com.example.greenStitch1.dto.UserInfoDto;
import com.example.greenStitch1.entity.UserInfo;
import com.example.greenStitch1.service.JwtService;
import com.example.greenStitch1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/info")
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;



    // for signup where no authentication and authorisation is required
    @PostMapping("/new")
    public String addNewUser(@RequestBody UserInfo userInfo) {
        return service.addUser(userInfo);
    }



    @GetMapping("/getInfo")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public UserInfoDto getInfoOfUserByName(@RequestParam("name") String name) {
        try{
            return service.getInfoOfUserByName(name);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("User invalid");
            return new UserInfoDto();
        }
    }


    // for login
    @PostMapping("/authenticate")
    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }


    }
}

