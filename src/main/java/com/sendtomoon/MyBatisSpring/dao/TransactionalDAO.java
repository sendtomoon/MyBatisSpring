package com.sendtomoon.MyBatisSpring.dao;

import com.sendtomoon.MyBatisSpring.entity.TestDTO;

public interface TransactionalDAO {

	void insert(TestDTO name);
}
