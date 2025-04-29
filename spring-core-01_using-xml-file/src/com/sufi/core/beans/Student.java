package com.sufi.core.beans;

public class Student {

	private int stuid;
	private String name;
	private String address;
	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void displaye() {
		System.out.println("Student Id:"+stuid);
		System.out.println("Student Name:"+name);
		System.out.println("Student Address:"+address);
	}
}
