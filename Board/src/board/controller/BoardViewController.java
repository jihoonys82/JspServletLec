package board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDto;
import board.dto.CommentDto;
import board.service.BoardService;

@WebServlet("/board/view.do")
public class BoardViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BoardService bsvc = new BoardService();
	private BoardDto bdto = new BoardDto();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		
		bdto = bsvc.view(boardNo);
		ArrayList<CommentDto> cdtos = bsvc.commentList(bdto);		
		
		request.setAttribute("post", bdto);
		request.setAttribute("reply", cdtos);
		
		request.getRequestDispatcher("/board/view.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
