package com.capgemini.servletswithoutsession.servletss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.servletswithoutsession.dao.EmployeeDao;
import com.capgemini.servletswithoutsession.dao.EmployeeDaoImpl;
import com.capgemini.servletswithoutsession.dto.Bean;

public class SearchEmploye extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id1");
		EmployeeDao service = new EmployeeDaoImpl();
	    Bean bean=service.getEmployeeDetailsById(Integer.parseInt(id));
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1></h1>");
		
	
		
				out.print("<tr><td>" + bean.getSid() + 
						"</td><td>" + bean.getSname() + 
						"</td><td>" + bean.getEmail() + 
						"</td>" +bean.getDept());
		
		out.print("</table>");
			
		

		out.println("</body>");
		out.println("</html>");

	
		super.doPost(req, resp);
	}

}
