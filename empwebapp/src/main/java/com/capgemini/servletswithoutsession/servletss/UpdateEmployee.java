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

public class UpdateEmployee extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id1");
		String name = req.getParameter("name");
		Bean bean = new Bean();
		bean.setSid(Integer.parseInt(id));
		bean.setSname(name);

		EmployeeDao dao = new EmployeeDaoImpl();
		boolean check = dao.updateEmployee(bean);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");

		if (check == true) {
			out.println("Updated");
		} else {
			out.println("Update unsucessfull");
		}
		 RequestDispatcher dispatcher=req.getRequestDispatcher("/login.html");
		    dispatcher.include(req, resp);
		    out.println("</h1>");
			out.println("</body>");
			out.println("</html>");
		super.doPost(req, resp);
	}
}
