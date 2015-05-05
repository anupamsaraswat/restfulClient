package org.anupam.pojo;

import org.anupam.util.ClientUtil;


public class UserInfoClient {

	private String name;
	private String age;
//	private String password;
//	
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public UserInfoClient(String name, String age){
		this.name= name;
		this.age = age;
	}
	
	public UserInfoClient(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}	
	
	
	public boolean isSeniorCitizen(){
		if(ClientUtil.calculateAge(this)>=60){
			return true;
		}else{
			return false;
		}
	}
	
}
