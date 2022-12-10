package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.implMember;

public class UsernameCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsernameCheckController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("BIG5");
		String username = request.getParameter("username");
		HttpSession se = request.getSession();
		if (new implMember().selectUsername(username)) {
			response.sendRedirect("addMemberError.jsp");
		}

		else {
			se.setAttribute("username", username);
			response.sendRedirect("addMember2.jsp");
		}
	}

}
