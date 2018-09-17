package gson;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dto.Person;

@WebServlet("/gson02.do")
public class GsonTest_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// com.google.Gson
		Gson gson = new Gson();
		
		// toJson
		Person p1 = new Person();
		p1.phone = "11111";
		
		String jsonText = gson.toJson(p1);
		System.out.println(jsonText);
		
		// fromJson
		Person p2 = gson.fromJson(jsonText, Person.class);
		System.out.println(p2);
		
		
	}


}
