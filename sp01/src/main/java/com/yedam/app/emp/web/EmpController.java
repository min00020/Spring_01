package com.yedam.app.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {
	@Autowired
	EmpService empService;
	
	//@Autowired
	//DeptService deptService;
	
	//GET  : 단순조회, 빈페이지
	//POST : 데이터 조작(등록, 수정, 삭제)
	
	//전체조회
	@GetMapping("empList")
	public String getEmpList(Model model) {
		List<EmpVO> list = empService.getEmpAll();
		model.addAttribute("empList",list);
		
		return "emp/empList"; //페이지에 대한 정보
	}
	
	
	//사원조회
	
	//사원등록 - FROM

	//사원등록 - PROCESS
	
	//사원수정 - PROCESS
	
	//사원삭제 - PROCESS
	
	
}
