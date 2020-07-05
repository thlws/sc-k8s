package org.thlws.study.sc.k8s.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author HanleyTang 2020/7/5
 */
@EnableFeignClients(basePackages = "org.thlws.study.sc.k8s.provider.api.feign")
@SpringBootApplication
public class ScK8sConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScK8sConsumerApplication.class, args);
    }

}

