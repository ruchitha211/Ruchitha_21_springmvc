package com.capgemini.servletswithoutsession.service;

import java.util.ArrayList;

import com.capgemini.servletswithoutsession.dto.Bean;

public interface EmployeeService {
	public boolean deleteEmployeeById(int id);
	public boolean updateEmployee(Bean b);
	public boolean  addEmployeeDetails(Bean b2);
	public Bean getEmployeeDetailsById(int id);
	public ArrayList<Bean> getAllEmployeeDetails();
	

}
