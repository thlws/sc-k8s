package org.thlws.study.sc.k8s.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author HanleyTang
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "redis")
public class MyRedisProperties {

    private String host;
    private Integer port;
    private String remark;
}
