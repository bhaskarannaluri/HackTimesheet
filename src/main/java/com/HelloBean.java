package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String name;
	private String pwd;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String testLogin(){
		if(name.equals("Bhaskar")){
			return "welcome";
		}else{
			return "index";
		}
		
	}
}