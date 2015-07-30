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
