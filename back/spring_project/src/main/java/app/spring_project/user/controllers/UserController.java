package app.spring_project.user.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.spring_project.user.beans.UserBean;

@RestController
@RequestMapping("api/user/")
public class UserController {
    @GetMapping
    @CrossOrigin(origins = {"http://localhost:4200"})
    @RequestMapping("getUser")
    public List<UserBean> getUser(){
        UserBean user = new UserBean();
        user.setId(1);
        user.setName("Tarou");
        user.setEmail("tarou@example.com");
        user.setPassword("abcd");
        List<UserBean> list = new ArrayList<UserBean>();
        list.add(user);
        return list;
    }
}
