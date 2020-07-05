package org.thlws.study.sc.k8s.provider.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.thlws.study.sc.k8s.provider.api.dto.UserDto;

/**
 * @author HanleyTang 2020/7/4
 */
@FeignClient(name = "sc-k8s-provider")
public interface UserFeign {

    @GetMapping("/userInfo")
    UserDto userInfo();

}
