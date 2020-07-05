package org.thlws.study.sc.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author HanleyTang
 */
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class ScK8sProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScK8sProviderApplication.class, args);
    }

}
