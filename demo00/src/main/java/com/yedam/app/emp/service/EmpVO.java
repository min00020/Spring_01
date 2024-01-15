package com.yedam.app.emp.service;

import lombok.Data;

@Data

public class EmpVO {
	//mybatis안에서 쓸 거니까 getter, setter필요
	String employee_id;
	String last_name;
	String email;
	String hire_date;
	String jon_id;
}
