package org.thlws.study.sc.k8s.service;

import org.thlws.study.sc.k8s.config.MyRedisProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author HanleyTang
 */
@Slf4j
@Component
public class TaskService {

    @Resource
    private MyRedisProperties redisProperties;

    @Scheduled(fixedDelay = 5000)
    public void print() {
        log.info("redis host=[{}], port=[{}], remark=[{}]",redisProperties.getHost(),redisProperties.getPort(),redisProperties.getRemark());
    }
}
