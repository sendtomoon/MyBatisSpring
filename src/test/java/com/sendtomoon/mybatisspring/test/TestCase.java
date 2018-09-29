package com.sendtomoon.mybatisspring.test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sendtomoon.MyBatisSpring.dao.TestDAO;
import com.sendtomoon.MyBatisSpring.entity.TestDTO;
import com.sendtomoon.MyBatisSpring.service.TestSerivce;

@ContextConfiguration(locations = { "classpath*:spring-application.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestCase extends AbstractJUnit4SpringContextTests {

	@Autowired
	private TestDAO dao;

	@Autowired
	private TestSerivce ts;

	@Test
	public void insert() {
		TestDTO dto = new TestDTO();
		dto.setId(UUID.randomUUID().toString().replace("-", ""));
		dto.setName("test1111");
		dao.insert(dto);
	}

	@Test
	public void test1() throws Exception {
		ts.test1();
	}

}
