package com.xworkz.web.servlet.companydetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = { "/company", "/Man" })
public class CompanyServlet extends HttpServlet {
	List<CompanyDTO> list = new ArrayList<CompanyDTO>();

	public CompanyServlet() {
		System.out.println(this.getClass().getSimpleName() + "running");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(this.getClass().getSimpleName() + "running");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method running in JobApplicationServlet");
		resp.setContentType("text/html");

		String name = req.getParameter("CompanyName");
		String founder = req.getParameter("CompanyFounder");
		String since = req.getParameter("CompanySince");
		String employee = req.getParameter("EmployeesName");
		String business = req.getParameter("CompanyBusiness");
		String address = req.getParameter("CompanyAddress");

		System.out.println("Name :" + name);
		System.out.println("Founder :" + founder);
		System.out.println("Since :" + since);
		System.out.println("Employee :" + employee);
		System.out.println("Business :" + business);
		System.out.println("Address :" + address);

		PrintWriter writer = resp.getWriter();
		writer.append("<html><head><h1> Details are saved</h1> <br>")
		.append("Name : ").append(name).append("<br><br>")
		.append("Founder : ").append(founder).append("<br><br>")
		.append("Since : ").append(since).append("<br><br>")
		.append("Employee : ").append(employee).append("<br><br>")
		.append("Business : ").append(business).append("<br><br>")
		.append("Address : ").append(address).append("<br><br>")
				.append("</head>").append("</html");

		CompanyDTO dto = new CompanyDTO(name, founder, since, employee, address, business);
		list.add(dto);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("calling doget method");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html>")
		
		.append("<head>")
		
		.append("<style>")
		
		.append("table,th,td{ border:1px solid black;border-collapse:collapse}")
		
		.append("table{width:60%}")
		
		.append("th{text-align:left};th,td{padding:10px}")
	
		
		.append("</style>")
		
.append("<body>");		
			writer .append("<table>")
			
			         .append("<tr>")
			         
			         .append("<th>CompanyName</th>")
			         .append("<th>Founder</th>")
			         .append("<th>Since</th>")
			         .append("<th>Employee</th>")
			         .append("<th>Address</th>")
			         .append("<th>Business</th>")
			         
			         .append("</tr>");
			         
			        			     		
			
			 for (CompanyDTO companyDTO : list) {
    
			        writer.append("<tr>")
			        
			         
			         .append("<td>").append(companyDTO.getName()).append("</td>")

					.append("<td>").append(companyDTO.getFounder()).append("</td>")
					
					.append("<td>").append(companyDTO.getSince()).append("</td>")
					
					.append("<td>").append(companyDTO.getEmployee()).append("</td>")

					.append("<td>").append(companyDTO.getAddress()).append("</td>")

					.append("<td>").append(companyDTO.getBusiness()).append("</td>")
					
					.append("</tr>");

		}
		writer.append("</table>").append("</body>").append("</html>");

	}
}
