package com.ssk.child.sblc_with_xml_config_demo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean, DisposableBean {
	private int id;
	private String city;
	private String country;
	private int pinCode;

	public Address() {
		super();
		System.out.println("Properties and Dependencies are set for Address.");
	}

	public Address(int id, String city, String country, int pinCode) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting address id");
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting address city");
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		System.out.println("Setting address country");
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		System.out.println("Setting address pinCode");
		this.pinCode = pinCode;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean::afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean::destroy() for address");
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("@PostConstruct + Custom init method for address");
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("@PreDestroy + Custom destroy method for address");
	}

}
