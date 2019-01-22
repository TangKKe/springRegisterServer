package com.spring.register.server.springRegisterServer;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * 测试类。
 * @author tangke
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class testCase1{

	@Autowired
	StringEncryptor encryptor;

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	
    @org.junit.Test
	public void testApp() {
		String encryptString = encryptor.encrypt("http://tangke:tangke123@peer2:8001/server/eureka/");
		System.out.println("-----encryptString: " + encryptString);
		System.out.println("-----原文:" + encryptor.decrypt(encryptString));
		Assert.assertTrue("hahahahha", encryptString.length() > 0);
	}
}
