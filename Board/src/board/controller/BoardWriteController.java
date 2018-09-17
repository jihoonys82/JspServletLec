package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.dto.BoardDto;
import board.service.BoardService;

/**
 * Servlet implementation class BoardWriteController
 */
@WebServlet("/board/write.do")
public class BoardWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HttpSession session;
    private BoardDto dto;
    private BoardService bsvc = new BoardService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		
		session.setAttribute("writer", "테스트 작성자");
		session.setAttribute("writerId", "99999");
		request.getRequestDispatcher("/board/write.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		
		int newBoardNo = 0;
		//login check
		if(session.getAttribute("writer")!=null) {
			if(request.getParameter("title")!=null && request.getParameter("title")!="" &&
					request.getParameter("content")!=null && request.getParameter("content")!="") {
				dto = new BoardDto();
				dto.setTitle(request.getParameter("title").toString());
				dto.setWriter(session.getAttribute("writer").toString());
				dto.setWriterId(session.getAttribute("writerId").toString());
				dto.setContent(request.getParameter("content").toString());
				
				newBoardNo = bsvc.write(dto);
			}
		}
		
		request.setAttribute("newBoardNo", newBoardNo);
		
		response.sendRedirect("/board/pagingList.do");
	}

}
