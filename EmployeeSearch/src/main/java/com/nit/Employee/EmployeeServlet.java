package com.nit.Employee;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw=res.getWriter();
		EmployeeBean eb=new EmployeeBean();
		res.setContentType("text/html");
		String eId = req.getParameter("empId");
		String eName=req.getParameter("empName");
		String esalary=req.getParameter("salary");
		String eDesignation=req.getParameter("designation");
		String eGender=req.getParameter("gender");
		
		if(!(eId.isBlank()))
		{
			int id = Integer.parseInt(eId);
			eb.setEmpId(id);
			EmployeeBean data = new EmployeeDao().getData(eb);
			pw.print("<h3>"+data+"</h3");
		}
		
		else if(!(eName.isBlank())) {
			eb.setEmpName(eName);
			EmployeeBean data = new EmployeeDao().getData(eb);
			pw.print("<h3>"+data+"</h3");
		}
		else if(!(esalary.isBlank())) {
			long sal = Long.parseLong(esalary);
			eb.setSalary(sal);
			EmployeeBean data = new EmployeeDao().getData(eb);
			pw.print("<h3>"+data+"</h3");
		}
		else if(!(eDesignation.isBlank())) {
			eb.setDesignation(eDesignation);
			EmployeeBean data = new EmployeeDao().getData(eb);
			pw.print("<h3>"+data+"</h3");
		}
		else if(!(eGender.isBlank())) {
			eb.setGender(eGender);
			EmployeeBean data = new EmployeeDao().getData(eb);
			pw.print("<h3>"+data+"</h3");
		}
		pw.println("employee search failed.....");
				}
}
