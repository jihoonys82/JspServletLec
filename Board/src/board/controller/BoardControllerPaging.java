package board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dto.BoardDto;
import board.service.BoardService;
import board.util.Paging;

@WebServlet("/board/pagingList.do")
public class BoardControllerPaging extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BoardService bsvc = new BoardService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//현재 페이지
		String param = request.getParameter("curPage");
		String search = request.getParameter("search");
		
		int curPage = 0;
		int totalCount = 0;
		if(!"".equals(param) && param != null) {
			curPage = Integer.parseInt(param);
		}
		
		Paging paging = null;
		List<BoardDto> boardList = null; 
		
		if(!"".equals(search) && search != null) {
			totalCount = bsvc.getTotal(search);
			paging = new Paging(totalCount, curPage);
			
			paging.setSearch(search);
			boardList = bsvc.selectPagingList(paging);
		} else {
			totalCount = bsvc.getTotal();
			// Paging Class 처리하기
			paging = new Paging(totalCount, curPage);
			
			boardList = bsvc.getPagingList(paging);
		}

		request.setAttribute("result", boardList);
		request.setAttribute("paging", paging);
		
		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
