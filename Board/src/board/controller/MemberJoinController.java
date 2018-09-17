package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.MemberDto;
import board.service.MemberService;

@WebServlet("/member/join.do")
public class MemberJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/member/joinForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberDto dto = new MemberDto();
		dto.setUserId(request.getParameter("userId"));
		dto.setUserNick(request.getParameter("userNick"));
		dto.setUserPw(request.getParameter("userPw"));
		
		MemberService msvc = new MemberService();
		msvc.join(dto);
		response.sendRedirect("/member/main.do");
		
	}

}
