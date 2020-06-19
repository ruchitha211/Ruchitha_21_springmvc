package com.capgemini.servletswithoutsession.servletss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.servletswithoutsession.dao.EmployeeDao;
import com.capgemini.servletswithoutsession.dao.EmployeeDaoImpl;
import com.capgemini.servletswithoutsession.dto.Bean;

public class AddEmployee  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		String sname = req.getParameter("name");
		String email = req.getParameter("email");
		String dept = req.getParameter("dept");
		
		Bean bean = new Bean();
		bean.setSid(Integer.parseInt(sid));
		bean.setSname(sname);
		bean.setEmail(email);
		
		bean.setDept(Integer.parseInt(dept));

		EmployeeDao dao = new EmployeeDaoImpl();
		boolean check= dao.addEmployeeDetails(bean);
		 PrintWriter out=resp.getWriter();
		    out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1></h1>");
			
		    if(check==true) {
						out.println("Inserted");
					}
					else {
						out.println("not inserted");
					}
							
		    out.println("</h1>"); 
			  
			out.println("</body>");
			out.println("</html>");
			 RequestDispatcher dispatcher=req.getRequestDispatcher("/login.html");
			    dispatcher.include(req, resp);
	
		super.doPost(req, resp);
	}
}
