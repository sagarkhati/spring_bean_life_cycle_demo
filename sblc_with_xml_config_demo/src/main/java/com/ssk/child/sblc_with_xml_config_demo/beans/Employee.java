package com.ssk.child.sblc_with_xml_config_demo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	private int id;
	private String name;
	private String gender;
	private Address address;

	public Employee(int id, String name, String gender, Address address) {
		System.out.println("Properties and Dependencies are set for Employee.");
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean::afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean::destroy() for employee");
	}
	
	public void initMethod() {
		System.out.println("Custom init method for employee");
	}
	
	public void destroyMethod() {
		System.out.println("Custom destroy method for employee");
	}
}
