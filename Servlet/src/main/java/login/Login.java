package login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		resp.sendRedirect("login.html");
	}
	
	public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter output = resp.getWriter();
		
		if(username.equals("admin") && password.equals("1234")) {
			output.println("<h1>GİRİŞ BAŞARILI!</h1>");
		}
		else if(username.equals("admin")) {
			output.println("<h1>KULLANICI ADI HATALI!</h1>");
		}else {
			output.println("<h1>ŞİFRE HATALI!</h1>");
		}
	}

}
