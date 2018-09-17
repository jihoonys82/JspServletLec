package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.dto.MemberDto;
import board.service.MemberService;

@WebServlet("/member/login.do")
public class MemberLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/member/loginForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberService msvc = new MemberService();
		String userId=request.getParameter("userId").toString();
		String userPw=request.getParameter("userPw").toString();
		
		MemberDto dto = msvc.login(userId, userPw);
		
		if(dto.getUserId()!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", dto.getUserId());
			session.setAttribute("userNick", dto.getUserNick());
			session.setAttribute("login", true);			
		}
		response.sendRedirect("/member/main.do");
		
	}

}
