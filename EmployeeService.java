package main.java.service;

import java.util.ArrayList;
import java.util.List;

import main.java.data.Employee;

public class EmployeeService {
	List<Employee> emp = new ArrayList<Employee>();
	public Object update;
	// create
	public void create(Employee s) {
		
		emp.add(s);
	}

//read
	public List<Employee> read() {
		return emp;
	}
	
//update
	public List<Employee> update(Employee s){
		//emp.set(0, s);
		return emp;
	}

	  
}