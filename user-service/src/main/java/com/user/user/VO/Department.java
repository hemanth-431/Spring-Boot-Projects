package com.user.user.VO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,updatable=false)
private Long departmentId;
private String departmentName;
private String departmentAddress;
private String departmentCode;



public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentAddress = departmentAddress;
	this.departmentCode = departmentCode;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
			+ departmentAddress + ", departmentCode=" + departmentCode + "]";
}
}
