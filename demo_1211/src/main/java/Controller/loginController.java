package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.implMember;


public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("big5");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession se=request.getSession();
		if(new implMember().selectUsername(username, password)) {
			se.setAttribute("name", username);
			response.sendRedirect("loginSuccess.jsp");
		}
		
		else {
			response.sendRedirect("loginError.jsp");
		}
	}

}
