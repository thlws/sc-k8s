package org.thlws.study.sc.k8s.consumer.fallback;

import org.springframework.stereotype.Component;
import org.thlws.study.sc.k8s.provider.api.dto.UserDto;
import org.thlws.study.sc.k8s.provider.api.feign.UserFeign;

/**
 * @author HanleyTang 2020/7/5
 */
@Component
public class UserFallback implements UserFeign {

    @Override
    public UserDto userInfo() {
        return UserDto.builder().remark("UserFallback!!!").build();
    }
}
