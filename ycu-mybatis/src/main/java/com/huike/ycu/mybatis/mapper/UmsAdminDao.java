package com.huike.ycu.mybatis.mapper;

import com.huike.ycu.mybatis.model.UmsAdmin;

public interface UmsAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    /** 根据用户名和密码进行查询 */
    UmsAdmin selectByUsernameAndPassword(UmsAdmin umsAdmin);


}