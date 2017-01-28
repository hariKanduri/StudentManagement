package com.student.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "SomeEntityGenerator")
	@SequenceGenerator(name = "SomeEntityGenerator",
	sequenceName = "userIdSequence")
	private Integer userId;
	private String userName;
	private String password;
	private Integer roleId;
	private String name;
	private long age;
	private long salary;
	
	public User() {

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	public long getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public void setAge(long age) {
		// TODO Auto-generated method stub
		this.age = age;
	}

	public long getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	public void setSalary(long salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
	}
}
