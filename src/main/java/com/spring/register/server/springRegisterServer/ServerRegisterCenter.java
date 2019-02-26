package com.spring.register.server.springRegisterServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 注册中心相关代码。
 * @author tangke
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerRegisterCenter {
	
	/**
	 * 启动主函数。
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServerRegisterCenter.class, args);
	}
	//新版（Spring Cloud 2.0 以上）的security默认启用了csrf检验，要在eurekaServer端配置security的csrf检验为false
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.csrf().disable();
	        super.configure(http);
	    }
	}

}
