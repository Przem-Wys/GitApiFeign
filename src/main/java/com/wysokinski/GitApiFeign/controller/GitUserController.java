package com.wysokinski.GitApiFeign.controller;

import com.wysokinski.GitApiFeign.DTO.UserDTO;
import com.wysokinski.GitApiFeign.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GitUserController {
private final UserService userService;
    @RequestMapping("/users/{login}")
    public UserDTO getUserDTO (@PathVariable String login){
        return userService.getUserByLogin(login);
    }

}
