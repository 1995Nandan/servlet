package com.xworkz.web.servlet.companydetails;

import java.io.Serializable;

public class CompanyDTO implements Serializable{
	
	private String name;
	private String founder;
	private String since;
	private String employee;
	private String address;
	private String business;
	
	
	public CompanyDTO() {
		System.out.println(this.getClass().getSimpleName());
	}


	public CompanyDTO(String name, String founder, String since, String employee, String address, String business) {
		super();
		this.name = name;
		this.founder = founder;
		this.since = since;
		this.employee = employee;
		this.address = address;
		this.business = business;
	}


	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", founder=" + founder + ", since=" + since + ", employee=" + employee
				+ ", address=" + address + ", business=" + business + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFounder() {
		return founder;
	}


	public void setFounder(String founder) {
		this.founder = founder;
	}


	public String getSince() {
		return since;
	}


	public void setSince(String since) {
		this.since = since;
	}


	public String getEmployee() {
		return employee;
	}


	public void setEmployee(String employee) {
		this.employee = employee;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBusiness() {
		return business;
	}


	public void setBusiness(String business) {
		this.business = business;
	}
	
	

	

}
