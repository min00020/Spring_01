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
	
	//GET  : �ܼ���ȸ, ��������
	//POST : ������ ����(���, ����, ����)
	
	//��ü��ȸ
	@GetMapping("empList")
	public String getEmpList(Model model) {
		List<EmpVO> list = empService.getEmpAll();
		model.addAttribute("empList",list);
		
		return "emp/empList"; //�������� ���� ����
	}
	
	
	//�����ȸ
	
	//������ - FROM

	//������ - PROCESS
	
	//������� - PROCESS
	
	//������� - PROCESS
	
	
}
