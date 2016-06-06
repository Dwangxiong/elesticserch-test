package com.lankr.vo;

public class HospitalModel {
	private String address ;
	private String uuid ;
	private String name ;
	
	public HospitalModel() {};
	
	public HospitalModel(String uuid, String name, String address) {
		this() ;
		this.setAddress(address) ;
		this.setUuid(uuid) ;
		this.setName(name) ;
	}
	
	public String getAdress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
