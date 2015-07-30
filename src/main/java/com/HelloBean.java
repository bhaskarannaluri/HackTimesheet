package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String name;
	private String pwd;
	private String errMsg;
	private Map<String, String> users ;

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	private boolean admin;
	


	
	private void  initialise(){
		users = new HashMap<String,String>();
		users.put("bhaskar", "bhaskar");
		users.put("hima", "hima");
		users.put("laxmi", "laxmi");
		users.put("admin", "admin");
		
	}
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

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
		initialise();
		if(StringUtils.isBlank(name)||StringUtils.isBlank(pwd)){
			this.errMsg = "UserName/Password is missing";
			return "index";
		}
		if(users.containsKey(name)){
			if(users.get(name).equalsIgnoreCase(pwd)){
				if(name.equalsIgnoreCase("admin")){
					admin= true;
				}else{
					admin = false;
				}
				return "welcome";
			}else{
				this.errMsg = "Password is Incorrect";
				return "index";
			}
		}else{
			this.errMsg ="User is not authorized";
			return "index";
		}
		
		
	}
}