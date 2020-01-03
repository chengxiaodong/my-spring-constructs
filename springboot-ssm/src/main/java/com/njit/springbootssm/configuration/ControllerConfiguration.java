package com.njit.springbootssm.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:陈晓东
 * @Date:2020/1/1 22:29
 * @Email:2775398338@qq.com
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"com.njit.springbootssm.controller"})
public class ControllerConfiguration {
}
