package com.yedam.app.emp.service;

import lombok.Data;

@Data

public class EmpVO {
	//mybatis�ȿ��� �� �Ŵϱ� getter, setter�ʿ�
	String employee_id;
	String last_name;
	String email;
	String hire_date;
	String jon_id;
}
