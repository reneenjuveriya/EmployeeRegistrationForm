package com.EmployeeForm.service;

import com.EmployeeForm.model.Employee;
import com.EmployeeForm.dao.EmployeeDao;

public class EmployeeService {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		EmployeeDao EmployeeDao=new EmployeeDao();
		return EmployeeDao.registerEmployee(employee);
		
	}
}
