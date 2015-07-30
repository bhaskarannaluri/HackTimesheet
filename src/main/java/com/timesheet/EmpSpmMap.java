package com.timesheet;

public class EmpSpmMap {
	Employee emp;
	SPMIDs spmIds;
	int hrs;
	String fromDate;
	String toDate;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public SPMIDs getSpmIds() {
		return spmIds;
	}

	public void setSpmIds(SPMIDs spmIds) {
		this.spmIds = spmIds;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
