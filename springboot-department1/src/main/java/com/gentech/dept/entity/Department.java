package com.gentech.dept.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_department")

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name= "id")
	private Long id;
	@Column(name="department")
	private String department;
	@Column(name="cityname")
	private String cityname;
	@Column(name="statename")
	private String statename;
	@Column(name="pincode")
	private Long pincode;
	

	public Department(Long id, String department, String cityname, String statename, Long pincode) {
		super();
		this.id = id;
		this.department = department;
		this.cityname = cityname;
		this.statename = statename;
		this.pincode = pincode;
	}
	
	public Department() 
		{
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

}
