package com.gui.controllers;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.ejb.services.TestService;
import com.jpa.entities.TestRecord;
@ManagedBean
public class TestController {
	
	private TestRecord employee = new TestRecord();

		
	@EJB
	private TestService service;
	public TestRecord getEmployee() {
		return employee;
	}
	public void setEmployee(TestRecord employee) {
		this.employee = employee;
	}
	



	public void saveEmployee(TestRecord emp) {
		service.addTestRecord(emp);
	}
	

	public List<TestRecord> listTestRecords(){
   		List<TestRecord> allEmployees=service.listTestRecords();
   		return allEmployees;
   	}
	

	
}