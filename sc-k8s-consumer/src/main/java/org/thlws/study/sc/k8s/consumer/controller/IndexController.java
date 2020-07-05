package org.thlws.study.sc.k8s.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thlws.study.sc.k8s.provider.api.dto.UserDto;
import org.thlws.study.sc.k8s.provider.api.feign.UserFeign;

/**
 * @author HanleyTang 2020/7/5
 */
@Slf4j
@RestController
public class IndexController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/")
    public UserDto userInfo(){
        log.info("消费方 consumer 即将使用 Feign 调用服务方 provider.");
        return userFeign.userInfo();
    }
}
