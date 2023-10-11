package com.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.dto.DeptDTO;

@Repository("deptDAO")
public class DeptDAO {

	@Autowired
	SqlSession session;

	// 목록보기
	public List<DeptDTO> deptList() {
		List<DeptDTO> list = session.selectList("DeptMapper.deptList");
		return list;
	}

}
