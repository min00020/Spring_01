package com.yedam.app.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.app.emp.service.EmpVO;

public interface EmpMapper {
	//��ü��ȸ
	public List<EmpVO> selectEmpList();
	
	//�ܰ���ȸ
	public EmpVO selectEmpInfo(EmpVO empvo);
	
	//���
	public int insertEmpInfo(EmpVO empVO);
	
	//����
	public int updateEmpInfo(EmpVO empVO);
	
	//����
	public int deleteEmpInfo(int empId);
	
	//���� : ����� �����͸� ����
	public int updateEmpInfoDynamic(EmpVO empVO);
	
	//���� : �Ű������� �ΰ��ΰ��
	public int updateEmpsal(@Param("eid") int empId, 
							@Param("info") EmpVO empVO);
	
}
