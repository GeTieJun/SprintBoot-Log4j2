package com.tiejun.log4jtest;

import java.util.ArrayList;

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
    	testArrayIndexOuputException();
    	testUserName("XiaoMing");
    	testPassword("123456789");
//        Assert.assertEquals("XiaoMing", properties.getUserName());
//        Assert.assertEquals("123456789", properties.getPassword());
    }
    
    /**
     * 数组角标越界测试
     */
    public void testArrayIndexOuputException() {
    	ArrayList<Integer> array = new ArrayList<>();
    	array.add(1);
    	array.add(2);
    	try {
    		array.get(array.size());
    	}catch (Exception e) {
			logger.error(">> The array size is: " + array.size() +" and The index out put", e);
		}
    }
    /**
     * 用户名测试
     * @param username
     */
    public void testUserName(String username) {
    	if(null != properties.getUserName()) {
    		if(username.equals(properties.getUserName())) {
        		logger.info(">> The user name is: " + properties.getUserName());
        	}else{
        		logger.info(">> The user name not equal XiaoMing, The user name is: " + properties.getUserName());
        	}
    	}else {
    		logger.error(">> The system user name is null, place check.");
    	}
    }
    
    /**
     * 用户密码测试
     * @param password
     */
    public void testPassword(String password) { 
    	if(password.equals(properties.getPassword())) {
    		logger.info(">> The password is: " + properties.getPassword());
    	}else {
    		logger.error(">> The password is error, The password is: " + properties.getPassword());
    	}
    }
}
