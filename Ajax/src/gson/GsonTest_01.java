package gson;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/GsonTest")
public class GsonTest_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// com.google.Gson
		Gson gson = new Gson();
		
		// toJson() : JSON 객체의 stringify
		System.out.println(gson.toJson(1)); // int
		System.out.println(gson.toJson("Alice")); // String
		System.out.println(gson.toJson(new Long(10))); // Long
		
		int[] arr = {1,2,3,4,5};
		System.out.println(gson.toJson(arr));
		
		//fromJson() : unmashalling, JSON.parse();
		int n1 = gson.fromJson("1", int.class);
		Integer n2 = gson.fromJson("123", Integer.class);
		Long n3 = gson.fromJson("123", Long.class);
		Boolean b = gson.fromJson("ture", Boolean.class);
		
	}


}
