package com.njit.springbootssm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author:陈晓东
 * @Date:2020/1/1 22:48
 * @Email:2775398338@qq.com
 * @Description:
 */
public interface UserMapper {
    @Select("select username from tb_user where id=#{id}")
    public String findUsername(@Param("id") String id);
}
