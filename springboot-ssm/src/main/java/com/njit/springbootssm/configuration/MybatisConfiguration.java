package com.njit.springbootssm.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

/**
 * @Author:陈晓东
 * @Date:2020/1/1 22:47
 * @Email:2775398338@qq.com
 * @Description:
 */
@MapperScan(basePackages = "com.njit.springbootssm.dao")
public class MybatisConfiguration {

}
