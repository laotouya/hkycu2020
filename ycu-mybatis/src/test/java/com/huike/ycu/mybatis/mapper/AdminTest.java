package com.huike.ycu.mybatis.mapper;

import com.huike.ycu.mybatis.model.UmsAdmin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
    @Autowired
    private UmsAdminDao adminDao;

    @Test
    public void insertAdminTest() {
        UmsAdmin admin = new UmsAdmin();
        admin.setNickName("哈哈");
        admin.setCreateTime(new Date());
        admin.setPassword("123456");
        admin.setUsername("张三");

        this.adminDao.insertSelective(admin);
    }
}
