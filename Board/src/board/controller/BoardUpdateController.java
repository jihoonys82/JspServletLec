package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDto;
import board.service.BoardService;

@WebServlet("/board/update.do")
public class BoardUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		
		BoardService bsvc = new BoardService();
		
		BoardDto dto = bsvc.view(boardNo);
		
		request.setAttribute("post", dto);
		
		request.getRequestDispatcher("/board/update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		BoardDto dto = new BoardDto();
		
		dto.setBoardNo(Integer.parseInt(request.getParameter("boardNo")));
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		
		BoardService bsvc = new BoardService();
		bsvc.update(dto);
		
		response.sendRedirect("/board/view.do?boardNo=" + request.getParameter("boardNo"));
		
	}

}
