package com.yedam.app;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.app.emp.mapper.EmpMapper;
import com.yedam.app.emp.service.EmpVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class MapperTest {
	@Autowired
	EmpMapper empMapper;
	
	@Test
	public void test() {
		List<EmpVO> list = empMapper.selectEmpList();
		
		//select했을 때 list 내부에 값이 들어오는지 체크하는 용도 (값 있는지 없는지)
		assertTrue(!list.isEmpty()); 
	}
}
