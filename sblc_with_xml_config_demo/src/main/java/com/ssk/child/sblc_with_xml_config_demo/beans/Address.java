package com.ssk.child.sblc_with_xml_config_demo.beans;

public class Address {
	private int id;
	private String city;
	private String country;
	private int pinCode;

	public Address() {
		super();
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
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
