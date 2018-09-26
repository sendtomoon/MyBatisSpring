package com.sendtomoon.MyBatisSpring.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sendtomoon.MyBatisSpring.common.Error1Exception;
import com.sendtomoon.MyBatisSpring.dao.TransactionalDAO;
import com.sendtomoon.MyBatisSpring.entity.TestDTO;

@Service
public class TransactionalServiceImpl implements TransactionalService {

	@Autowired
	private TransactionalDAO dao;

	@Override
	@Transactional
	public String TranTest1(String name) {
		TestDTO dto = new TestDTO();
		dto.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		dto.setName(name);
		try {
			dao.insert(dto);
			if (true) {
				throw new Error1Exception("事务错误");
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return "1111";
	}

	@Override
	@Transactional
	public String TranTest2(String name) {
		TestDTO dto = new TestDTO();
		dto.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		dto.setName(name);
		dao.insert(dto);
		if (1 < 2) {
			throw new Error1Exception("事务错误");
		}
		return "2222";
	}

}
