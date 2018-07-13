package com.liyingyu.multiDatasource.controller;

import com.liyingyu.multiDatasource.entity.primary.User1;
import com.liyingyu.multiDatasource.entity.secondary.User2;
import com.liyingyu.multiDatasource.repository.primary.UserRepository_1;
import com.liyingyu.multiDatasource.repository.secondary.UserRepository_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Yingyu Li
 * @create 2018-07-13 10:52
 **/

@RestController
public class UserController {

    private final UserRepository_1 userRepository_1;

    private final UserRepository_2 userRepository_2;

    @Autowired
    public UserController(UserRepository_1 userRepository_1, UserRepository_2 userRepository_2) {
        this.userRepository_1 = userRepository_1;
        this.userRepository_2 = userRepository_2;
    }

    @GetMapping("/userList_1")
    public List<User1> getUsers1(){
        return userRepository_1.findAll();
    }

    @GetMapping("/userList_2")
    public List<User2> getUsers2(){
        return userRepository_2.findAll();
    }

}
