package com.tiejun.log4jtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jTestApplication {
	
	//日志处理
	private static Logger logger = LoggerFactory.getLogger(Log4jTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jTestApplication.class, args);
	}

}

