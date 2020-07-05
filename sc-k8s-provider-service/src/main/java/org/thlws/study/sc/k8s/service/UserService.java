package org.thlws.study.sc.k8s.service;

import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.RandomUtil;
import org.springframework.stereotype.Service;
import org.thlws.study.sc.k8s.provider.api.dto.UserDto;

/**
 * @author HanleyTang 2020/7/5
 */
@Service
public class UserService {

    public UserDto getUserInfo(){
        return UserDto.builder().address("SH-"+RandomUtil.randomInt(100))
                .id(RandomUtil.randomInt())
                .remark(NetUtil.getLocalhostStr())
                .username(RandomUtil.randomString(5)).build();
    }

}
