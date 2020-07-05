package org.thlws.study.sc.k8s.provider.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author HanleyTang 2020/7/5
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    private int id;
    private String username;
    private String address;
    private String remark;
}
