package com.knight.util;

import com.knight.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author : Knight
 * @program : blog
 * @description :
 * @date : 2021-01-05 16:59
 **/
public class ShiroUtil {

    public static AccountProfile getProfile() {

        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();

    }
}
