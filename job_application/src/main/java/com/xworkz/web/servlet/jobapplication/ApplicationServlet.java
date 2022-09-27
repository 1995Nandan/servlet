package com.xworkz.web.servlet.jobapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet(loadOnStartup = 1, urlPatterns = "/job")
public class ApplicationServlet extends HttpServlet {

	List<ApplicationDTO> dto = new ArrayList<ApplicationDTO>();

	public ApplicationServlet() {
		System.out.println(this.getClass().getSimpleName() + "running");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(this.getClass().getSimpleName() + "running");

	}

	@Override
	protected void service(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method running in JobApplicationServlet");
		resp.setContentType("text/html");

		String name = res.getParameter("ApplicantName");
		String eamil = res.getParameter("ApplicantEmail");
		String phoneNo = res.getParameter("ApplicantPhoneNo");
		String alternatPhoneNo = res.getParameter("ApplicantAlternativePhoneNo");
		String gender = res.getParameter("ApplicantGender");
		String qualification = res.getParameter("ApplicantQualification");
		String yop = res.getParameter("ApplicantYop");
		String university = res.getParameter("ApplicantUniversity");
		String address = res.getParameter("ApplicantAdress");
		String[] skill = res.getParameterValues("skill");
		if(skill!=null)
		for (String ref : skill) {
			System.out.println("skills selected"+ref);
		}
		String salary = res.getParameter("ApplicantSalary");
		String experince = res.getParameter("ApplicantExperince");
		String idProof = res.getParameter("ApplicantIdProof");
		String idProofNumber = res.getParameter("ApplicantIdProofNumber");

		System.out.println("name" + name);
		System.out.println("Eamil" + eamil);
		System.out.println("phoneNo" + phoneNo);
		System.out.println("alternatPhoneNo" + alternatPhoneNo);
		System.out.println("gender" + gender);
		System.out.println("qualification" + qualification);
		System.out.println("yop" + yop);
		System.out.println("university" + university);
		System.out.println("address" + address);
		System.out.println("skill" + skill);
		System.out.println("salary" + salary);
		System.out.println("experince" + experince);
		System.out.println("idProof" + idProof);
		System.out.println("idProofNumber" + idProofNumber);


		PrintWriter writer = resp.getWriter();
		writer.append("<html>").append("<body>").append("<h2>").append("Registration is success..,Below is the Details...!").append("</h2>")
				.append("</br>").append("Name : ").append(name).append("</br>").append("<br>").append("Eamil : ").append(eamil).append("<br>")
				.append("</br>").append("PhoneNo : ").append(phoneNo).append("</br>").append("<br>").append("AlternativePhoneNo : ")
				.append(alternatPhoneNo).append("</br>").append("<br>").append("Gender : ").append(gender).append("</br>").append("<br>")
				.append("Qualification : ").append(qualification).append("<br>").append("</br>").append("YOP : ").append(yop).append("</br>").append("<br>")
				.append("University : ").append(university).append("</br>").append("<br>").append("Address : ").append(address).append("<br>")
				.append("</br>").append("</br>").append("<br>").append("Salary : ").append(salary).append("<br>")
				.append("</br>").append("Experince : ").append(experince).append("</br>").append("<br>").append("IdProof : ").append(idProof).append("<br>")
				.append("</br>").append("IdProofNumber : ").append(idProofNumber).append("</br>").append("</body>")
				.append("</html>");



	}

	@Override
	public void destroy() {
		System.out.println("servlet is destroyed");
	}
}
