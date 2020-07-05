package org.thlws.study.sc.k8s.controller;

import cn.hutool.core.net.NetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thlws.study.sc.k8s.config.MyRedisProperties;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HanleyTang
 */
@Slf4j
@RestController
public class IndexController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private MyRedisProperties redisProperties;

    @RequestMapping("/")
    public String index() {
        return "this is "+applicationName+" IP:"+  NetUtil.getLocalhostStr();
    }

    @RequestMapping("/redis")
    public String redis(){
        log.info("redis host=[{}], port=[{}], remark=[{}]",redisProperties.getHost(),redisProperties.getPort(),redisProperties.getRemark());
        return redisProperties.toString();
    }

    @GetMapping("/servers")
    public List<String> servers() {
        return discoveryClient.getServices();
    }


}
