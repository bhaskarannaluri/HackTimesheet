package com.timesheet;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@SessionScoped
public class EmployeeBean {
	private List<Employee> employeeList;
	public void setEmployeeList(List<Employee> employeeList){
		this.employeeList =employeeList;
	}
  public List<Employee> getEmployeeList(String mgrId){
	  employeeList = new ArrayList<Employee>();
	  Employee emp = new Employee();
	  emp.setEmpId("E200");
	  emp.setEmpName("Bhaskar");
	  employeeList.add(emp);
	  emp = new Employee();
	  emp.setEmpId("E201");
	  emp.setEmpName("Laxminarsimha");
	  employeeList.add(emp);
	  emp = new Employee();
	  emp.setEmpId("E202");
	  emp.setEmpName("Himavanth");
	  employeeList.add(emp);
	return employeeList;
	  
  }
   
  
  public static void main(String ar[]){
	  System.out.println(new EmployeeBean().getEmployeeList("M001"));
  }
}
