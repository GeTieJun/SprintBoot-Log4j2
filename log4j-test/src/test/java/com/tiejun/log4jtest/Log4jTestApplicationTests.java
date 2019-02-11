package com.tiejun.log4jtest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tiejun.log4jtest.service.Properties;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Log4jTestApplicationTests {

	//日志处理
	private static Logger logger = LoggerFactory.getLogger(Log4jTestApplicationTests.class);
	
	@Autowired
	private Properties properties;
	
    @Test
    public void test1() throws Exception {
        Assert.assertEquals("XiaoMing", properties.getUserName());
        logger.error(">>>>>>>>>>>>>>>>>> is log error info....");
        logger.debug(">>>>>>>>>>>>>>>>>> is log debug info....");
        logger.info(">>>>>>>>>>>>>>>>>> is log info..........");
        Assert.assertEquals("123456789", properties.getPassword());
    }

}

