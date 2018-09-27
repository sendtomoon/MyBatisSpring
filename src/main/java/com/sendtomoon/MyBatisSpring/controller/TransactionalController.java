package com.sendtomoon.MyBatisSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sendtomoon.MyBatisSpring.common.Error1Exception;
import com.sendtomoon.MyBatisSpring.service.TransactionalService;

@Controller
@RequestMapping("/transaction")
public class TransactionalController {

	@Autowired
	private TransactionalService ts;

	@RequestMapping("test1")
	@ResponseBody
	public String transaction1(@RequestParam(value = "name", required = true) String name) {
		return ts.TranTest1(name);
	}

	@RequestMapping("test2")
	@ResponseBody
	public String transaction2(@RequestParam(value = "name", required = true) String name) {
		return ts.TranTest2(name);
	}
}
