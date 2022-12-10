package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.implMember;
import Model.member;

public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addMemberController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("BIG5");
		HttpSession se = request.getSession();
		String username = (String) se.getAttribute("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		member m=new member(username,password,name,address,phone);
		new implMember().add(m);
		response.sendRedirect("addMemberSuccess.jsp");
	}

}
