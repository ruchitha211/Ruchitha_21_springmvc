package com.capgemini.servletswithoutsession.service;

import java.util.ArrayList;

import com.capgemini.servletswithoutsession.dao.EmployeeDao;
import com.capgemini.servletswithoutsession.dao.EmployeeDaoImpl;
import com.capgemini.servletswithoutsession.dto.Bean;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao dao=new EmployeeDaoImpl();

	@Override
	public boolean deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeById(id);
	}

	@Override
	public boolean updateEmployee(Bean b) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(b);
	}

	@Override
	public boolean addEmployeeDetails(Bean b2) {
		// TODO Auto-generated method stub
		return dao.addEmployeeDetails(b2);
	}

	@Override
	public Bean getEmployeeDetailsById(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeDetailsById(id);
	}

	@Override
	public ArrayList<Bean> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeDetails();
	}
	

}
