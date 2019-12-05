package com.shidun.learn.testFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "test1")
public interface HelloRemote {
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    String login(@RequestParam(name = "userAccount") String userName, @RequestParam(name = "password") String password);
}
