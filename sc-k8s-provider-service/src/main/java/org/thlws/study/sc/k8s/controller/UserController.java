package org.thlws.study.sc.k8s.controller;

import org.springframework.web.bind.annotation.RestController;
import org.thlws.study.sc.k8s.provider.api.dto.UserDto;
import org.thlws.study.sc.k8s.provider.api.feign.UserFeign;
import org.thlws.study.sc.k8s.service.UserService;

import javax.annotation.Resource;

/**
 * @author HanleyTang 2020/7/5
 */
@RestController
public class UserController implements UserFeign {

    @Resource
    private UserService userService;

    @Override
    public UserDto userInfo() {
        return userService.getUserInfo();
    }
}
