package com.huike.ycu.mybatis.service;

import com.huike.ycu.mybatis.model.UmsAdmin;

public interface AdminService {

    /** 使用用户名和密码进行登录 */
    UmsAdmin login(UmsAdmin umsAdmin) ;
}
