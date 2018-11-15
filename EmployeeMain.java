package main.java.application;

import java.awt.List;
import java.util.ArrayList;

import main.java.data.Employee;
import main.java.service.EmployeeService;

public class EmployeeMain {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeService obj = new EmployeeService();
		Employee employ = new Employee();
		Employee employ1 = new Employee();
		Employee employ2 = new Employee();
		
		employ.name = "Sudhha";
		employ.contactNum = "98798798";
		employ.age = 22;
		employ.id = 1;
		obj.create(employ);	
		
		employ1.name = "Murthy";
		employ1.contactNum = "98798798";
		employ1.age = 22;
		employ1.id = 1;
		obj.create(employ1);	
		
		employ2.name = "riddhi";
		employ2.contactNum = "98798798";
		employ2.age = 22;
		employ2.id = 1;
		obj.create(employ2);	
		
		
		ArrayList<Employee> read = (ArrayList<Employee>) obj.read();
		for (int i=0; i< read.size(); i++) {
		Employee e = read.get(i);
		System.out.println(e.name);
		
		ArrayList<Employee> update = (ArrayList<Employee>)obj.update();
//		Employee t = update.set(employ.age,"9"); 
//		System.out.println(t);
		
		obj.update(employ1);
		update.set(employ.id,"8");
		
		
	}

}
}
