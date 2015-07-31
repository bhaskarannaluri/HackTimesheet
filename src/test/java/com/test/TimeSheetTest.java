package com.test;

import com.timesheet.EmpSpmMap;
import com.timesheet.EmpSpmMapBean;
import com.timesheet.Employee;
import com.timesheet.EmployeeBean;

import java.util.List;

import org.junit.Test;

public class TimeSheetTest{
	
	@Test
	public void testGetEmployees(){
		System.out.println("Testing Employees Enter");
		List<Employee> emps=new EmployeeBean().getEmployeeList("M001");
		System.out.println("The employees are ");
		for(Employee e:emps){
			System.out.println(e.getEmpName());
		}
		System.out.println("Testing Employees Exit");
	}
	@Test
	public void testGetEmployeesSpmIds(){
		System.out.println("Testing testGetEmployeesSpmIds Enter");
		List<EmpSpmMap> emps=new EmpSpmMapBean().getEmpSpmMapList();
		System.out.println("The employees are ");
		for(EmpSpmMap e:emps){
			System.out.println(e.getEmp().getEmpName()+"-->"+e.getSpmIds().getSpmId());
		}
		System.out.println("Testing testGetEmployeesSpmIds Exit");
	}
}