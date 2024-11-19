package com.nit.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao {

	public EmployeeBean getData(EmployeeBean eb)
	{
		EmployeeBean eBean=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","756059");
			if(eb.getEmpId()!=0)
			{
			PreparedStatement ps= con.prepareStatement
					("select * from EmployeeDetails where empid=?");
			ps.setInt(1, eb.getEmpId());
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				eBean=new EmployeeBean();
				eBean.setEmpId(rs.getInt(1));
				eBean.setEmpName(rs.getString(2));
				eBean.setSalary(rs.getLong(3));
				eBean.setDesignation(rs.getString(4));
				eBean.setGender(rs.getString(5));
				System.out.println(eBean);
				return eBean;
			}
			}
			else if(eb.getEmpName()!=null)
			{
			PreparedStatement ps= con.prepareStatement
					("select * from EmployeeDetails where empname=?");
			ps.setString(1, eb.getEmpName());
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				eBean=new EmployeeBean();
				eBean.setEmpId(rs.getInt(1));
				eBean.setEmpName(rs.getString(2));
				eBean.setSalary(rs.getLong(3));
				eBean.setDesignation(rs.getString(4));
				eBean.setGender(rs.getString(5));
			}
			}
			else if(eb.getSalary()!=0)
			{
			PreparedStatement ps= con.prepareStatement
					("select * from EmployeeDetails where salary=?");
			ps.setLong(1, eb.getSalary());
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				eBean=new EmployeeBean();
				eBean.setEmpId(rs.getInt(1));
				eBean.setEmpName(rs.getString(2));
				eBean.setSalary(rs.getLong(3));
				eBean.setDesignation(rs.getString(4));
				eBean.setGender(rs.getString(5));
			}
			}
			
			else if(eb.getDesignation()!=null)
			{
			PreparedStatement ps= con.prepareStatement
					("select * from EmployeeDetails where designation=?");
			ps.setString(1, eb.getDesignation());
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				eBean=new EmployeeBean();
				eBean.setEmpId(rs.getInt(1));
				eBean.setEmpName(rs.getString(2));
				eBean.setSalary(rs.getLong(3));
				eBean.setDesignation(rs.getString(4));
				eBean.setGender(rs.getString(5));
			}
			}
			
			else if(eb.getGender()!=null)
			{
			PreparedStatement ps= con.prepareStatement
					("select * from EmployeeDetails where gender=?");
			ps.setString(1, eb.getGender());
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				eBean=new EmployeeBean();
				eBean.setEmpId(rs.getInt(1));
				eBean.setEmpName(rs.getString(2));
				eBean.setSalary(rs.getLong(3));
				eBean.setDesignation(rs.getString(4));
				eBean.setGender(rs.getString(5));
			}
			}
			
			else {
				System.out.println("employee search is failed....");
			}
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		
		
		return eBean;
		
	}

}
