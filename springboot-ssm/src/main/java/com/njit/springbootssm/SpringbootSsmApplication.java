package com.njit.springbootssm;

import com.njit.springbootssm.configuration.ControllerConfiguration;
import com.njit.springbootssm.configuration.FreemarkerResolverConfig;
import com.njit.springbootssm.configuration.MybatisConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ControllerConfiguration.class, MybatisConfiguration.class, FreemarkerResolverConfig.class})
public class SpringbootSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSsmApplication.class, args);
	}

}
