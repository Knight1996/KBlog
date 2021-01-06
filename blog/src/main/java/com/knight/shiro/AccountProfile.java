package com.knight.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : Knight
 * @program : blog
 * @description :
 * @date : 2021-01-05 14:50
 **/
@Data
public class AccountProfile implements Serializable {

    private Long id;
    private String username;
    private String avatar;
    private String email;
}
