package com.nit.Employee;
import java.io.Serializable;
public class EmployeeBean implements Serializable {
private int empId;
private String empName;
private long salary;
private  String designation;
private String gender;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", designation="
			+ designation + ", gender=" + gender + "]";
}
}
