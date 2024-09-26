package com.gentech.springboot_employee.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	
	@Column(name="ename")
	private String ename;
	@Column(name="age")
	private int age;
	@Column(name="department")
	private String department;
	@Column(name="salary")
	private int salary;
	
	@CreationTimestamp
	@Column(name = "create_at", nullable=false, updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name = "update_at", nullable=false)
	private Date updatedAt;
	
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updatedAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updatedAt = updateAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long Id) {
		this.id=id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee(Long id, String ename, int age, String department, int salary, Date createdAt, Date updateAt) {
		super();
		this.id = id;
		this.ename = ename;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.createdAt = createdAt;
		this.updatedAt = updateAt;
	}
	public Employee()
	{
		
	}
	
		
	}
	

	
	
	

	