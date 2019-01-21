package com.spring.register.server.springRegisterServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

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
}
