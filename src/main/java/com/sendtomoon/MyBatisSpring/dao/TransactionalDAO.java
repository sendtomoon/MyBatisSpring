package com.sendtomoon.MyBatisSpring.dao;

import com.sendtomoon.MyBatisSpring.common.CommonBatis;
import com.sendtomoon.MyBatisSpring.entity.TestDTO;
@CommonBatis
public interface TransactionalDAO {

	void insert(TestDTO name);
}
