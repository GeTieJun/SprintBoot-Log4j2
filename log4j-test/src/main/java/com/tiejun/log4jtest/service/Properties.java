package com.tiejun.log4jtest.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 将配置文件的值注入到某一个实体类中方式分为两种
// 1.单个值进行注入，在applicaton.properties中单独写入 com.tiejun.properties.password=123456789 
//   在实体类每个字段上使用@Value("${com.tiejun.properties.password}")进行注入
// 2.基于类型安全的配置，在applicaton.properties中单独写入user.password=123456789
//   在实体类上面
@Component
@ConfigurationProperties (prefix="user")
public class Properties {
	
	// @Value("${com.tiejun.properties.userName}")
	private String userName;
	
	// @Value("${com.tiejun.properties.password}")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
