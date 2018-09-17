package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;


@WebServlet("/file/upload_cos.do")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/file/fileUpload.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HTTP 요청/응답 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// 응답객체 출력 스트림
		PrintWriter out = response.getWriter();
		
		// MultipartRequest 생성자 매개변수 준비
		// 1. HttpServletRequest request - 따로 준비할 필요없음(doPost 메서드가 가지고 있음)
		
		// 2. String saveDirectory - 서버의 실제 경로로 지정한다
		ServletContext context = getServletContext();
		String saveDirectory = context.getRealPath("upload");
		
		// 3. int MaxPostSize - 업로드 제한 용량을 바이트단위로 지정한다. 
		int maxPostSize = 10 * 1024 * 1024; //10MB
		
		// 4. String encoding - 업로드 정보 인코딩 방식 지정
		String encoding = "UTF-8";
		
		// 5. FileRenamePolicy policy - 파일이름 중복되었을 때 처리하는 방식을 지정
		FileRenamePolicy policy = new DefaultFileRenamePolicy();
		
		// MultipartRequest 생성  - 파일업로드 관리하는 클래스
		MultipartRequest mul = new MultipartRequest(request, saveDirectory, maxPostSize, encoding, policy);
		
		out.println("--- 전달 파라미터 ---<br>");
		out.println( mul.getParameter("title") );

		out.println("<br><br>--- 업로드파일 ---<br>");
		File up = mul.getFile("uploadFile");
		out.println( up.toString() );
		
		out.println("<br><br>--- 저장된 파일이름 ---<br>");
		out.println( mul.getFilesystemName("uploadFile") );

		out.println("<br><br>--- 원본 파일이름 ---<br>");
		out.println( mul.getOriginalFileName("uploadFile") );

		out.println("<br><br>--- 파일 형식 ---<br>");
		out.println( mul.getContentType("uploadFile") );
	}

}
