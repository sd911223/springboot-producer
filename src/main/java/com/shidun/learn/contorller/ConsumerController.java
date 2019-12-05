package com.shidun.learn.contorller;

import com.shidun.learn.testFeign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ConsumerController {
    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/login")
    public String index(@RequestParam(name = "userAccount") String userName, @RequestParam(name = "password") String password) {
        String login = HelloRemote.login(userName, password);
        System.out.println(login);
        return login;
    }
}
