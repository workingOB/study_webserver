package com.oldbear.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("view/users")
    public List<User> getUsers(){
        return List.of(User.builder().name("oldbear").build());
    }
}
