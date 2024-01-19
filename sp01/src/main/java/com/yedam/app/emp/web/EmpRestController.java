package com.yedam.app.emp.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@CrossOrigin("*") //CORS 허용해주는 거
//@Controller
@RestController //내부에있는 모든 메소드=데이터 반환한다는 의미 > @ResponseBody  생략가능
public class EmpRestController {
	@Autowired
	EmpService empService;
	
	//전체조회
	@GetMapping("emps")
	//@ResponseBody
	public List<EmpVO> getEmpList(){
		return empService.getEmpAll();
	}
	
	//단건조회
	@GetMapping("emps/{id}") //노드:emps/:id
	//@ResponseBody
	public EmpVO getEmpInfo(@PathVariable Integer id) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(id);
		return empService.getEmpInfo(empVO);
	}
	
	//등록
	@PostMapping("emps")
	//@ResponseBody
	public Map<String, Object> insertEmpInfo(@RequestBody EmpVO empVO){
		int eid = empService.insertEmpInfo(empVO);
		Map<String, Object> map = new HashMap<>();
		map.put("result", eid);
		return map;
	}
	
	//수정
	@PutMapping("emps/{id}")
	//@ResponseBody
	public Map<String, Object> updateEmpInfo(@PathVariable Integer id, @RequestBody EmpVO empVO){
		empVO.setEmployeeId(id);
		return empService.updateEmpInfo(empVO);
	}
	
	//삭제
	@DeleteMapping("emps")
	//@ResponseBody
	public boolean deleteEmpInfo(@PathVariable Integer id) {
		return empService.deleteEmpInfo(id);
	}

}
