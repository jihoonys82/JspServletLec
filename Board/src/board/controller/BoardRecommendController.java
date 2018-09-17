package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDto;
import board.service.BoardService;

@WebServlet("/board/recommend.do")
public class BoardRecommendController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(Integer.parseInt(request.getParameter("boardNo")));
		dto.setWriterId(request.getSession().getAttribute("userId").toString());
		
		BoardService bsvc = new BoardService();
		bsvc.recommend(dto);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
