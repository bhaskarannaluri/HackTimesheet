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
public class EmpSpmMapBean {
	public List<EmpSpmMap> empSpmMapList;

	public List<EmpSpmMap> getEmpSpmMapList() {
		empSpmMapList = new ArrayList<EmpSpmMap>();
		EmpSpmMap map = new EmpSpmMap();
		map.emp=new Employee();
		map.spmIds= new SPMIDs();
		map.emp.setEmpName("Bhaskar");
		map.spmIds.setSpmId("11060A1");
		map.setFromDate("30-Jul-2015");
		map.setToDate("5-Aug-2015");
		map.setHrs(40);
		empSpmMapList.add(map);
		EmpSpmMap map1 = new EmpSpmMap();
		map1.emp=new Employee();
		map1.spmIds= new SPMIDs();
		map1.emp.setEmpName("Hima");
		map1.spmIds.setSpmId("11060A2");
		map1.setFromDate("30-Jul-2015");
		map1.setToDate("5-Aug-2015");
		map1.setHrs(40);
		empSpmMapList.add(map1);
		return empSpmMapList;
	}

	public void setEmpSpmMapList(List<EmpSpmMap> empSpmMapList) {
		this.empSpmMapList = empSpmMapList;
	}

	public void addEmpSpmMapList(EmpSpmMap empSpmMapList) {
		if (this.empSpmMapList == null) {
			this.empSpmMapList = new ArrayList<EmpSpmMap>();
		}
		this.empSpmMapList.add(empSpmMapList);
	}
}
