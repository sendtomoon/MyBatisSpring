package com.sendtomoon.MyBatisSpring.controller.test;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sendtomoon.MyBatisSpring.dao.TestDAO;
import com.sendtomoon.MyBatisSpring.entity.TestDTO;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestDAO dao;

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public String test1(@RequestParam(value = "name") String name) {
		TestDTO dto = dao.query(name);
		return dto.toString();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	@ResponseBody
	public String insert(@RequestParam(value = "name") String name) {
		TestDTO dto = new TestDTO();
		dto.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		dto.setName(name);
		dao.insert(dto);
		return "插入成功";
	}
}
