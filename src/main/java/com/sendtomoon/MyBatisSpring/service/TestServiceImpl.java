package com.sendtomoon.MyBatisSpring.service;

import org.springframework.stereotype.Service;

import com.sendtomoon.MyBatisSpring.common.Error1Exception;

@Service
public class TestServiceImpl implements TestSerivce {

	public String test1() throws Error1Exception {
	
			this.testEx();
		
		return null;
	}
	
	private void testEx() throws Error1Exception {
		throw new Error1Exception("错误测试1");
	}

}
