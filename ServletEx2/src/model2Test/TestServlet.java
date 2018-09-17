package model2Test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//VIEW 호출 
		RequestDispatcher rd = request.getRequestDispatcher("/test/inputName.jsp");
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 전달 파라미터 
		String name = request.getParameter("name");
//		System.out.println("[Debug] name : " + name);
		
		name += ", Hello!"; // data 가공
		
		// VIEW에 전달할 데이터 담기 - Model 처리
		request.setAttribute("data", name);
		
		// VIEW 호출 - /test/result.jsp
		request.getRequestDispatcher("/test/result.jsp").forward(request, response);
	}

}
