package com.huike.ycu.mybatis.service.impl;

import com.huike.ycu.mybatis.mapper.UmsAdminDao;
import com.huike.ycu.mybatis.model.UmsAdmin;
import com.huike.ycu.mybatis.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private UmsAdminDao adminDao;

    @Override
    public UmsAdmin login(UmsAdmin umsAdmin) {
        return this.adminDao.selectByUsernameAndPassword(umsAdmin);
    }
}
