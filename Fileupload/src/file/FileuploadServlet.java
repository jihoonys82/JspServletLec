package file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileuploadServlet
 */
@WebServlet("/file/upload.do")
public class FileuploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// file upload form 띄우기
		request.getRequestDispatcher("/file/fileUpload.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// uploaded file 처리하기
		
		// 전송 파라미터 한글 인코딩 설정 : UTF-8
		request.setCharacterEncoding("UTF-8");
		
		// 응답 객체 MIME타입 설정 : HTML, 한글 이코딩 UTF-8
		response.setContentType("text/html;charset=UTF-8");
		
		// 응답 객체 출력 스트림 
		PrintWriter out = response.getWriter();
		
		// 파일 업로드 작업 시작 
		
		// 1. 파일 업로드 한거 맞는지 확인 (enctype 이 multipart 인지 확인하는 메서드)
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		// 1-1. multipart/form-data가 아닌 경우.
		if(!isMultipart) {
			out.println("<h1>encType is not multipart!</h1>");
			return;
		}
		
		// 1-2. multipart/form-data 일 경우 
		// 	파일이 전송되었을 경우 
		
		// 2. 업로드 파일을 처리하는 아이템 팩토리 생성
		DiskFileItemFactory factory = null;
		factory = new DiskFileItemFactory();
		
		// 3. 업로드 아이템이 적당히 작으면 메모리에서 처리
		int maxMem = 1 * 1024 * 1024; // 1MB
		factory.setSizeThreshold(maxMem);
		
		// 4. 적당히 큰 아이템이면 임시파일을 만들어서 처리(메모리)
		factory.setRepository(new File(getServletContext().getRealPath("tmp")));
		
		// 5. 업로드 허용기준에 맞는 용량의 파일이면 업로드 수행 
		long maxFile = 10 * 1024 * 1024; // 10MB
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		upload.setSizeMax(maxFile); // 업로드 용량 제한 설정
		
		// 6. 업로드 데이너 파싱(추출) - 임시파일 업로드 
		List<FileItem> items = null;
		try {
			items = upload.parseRequest(request);
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		
		// 7. 폼필드 처리 
		Iterator<FileItem> iter = items.iterator();
		while(iter.hasNext()) {
			FileItem item = iter.next();
			// 빈파일(비정상파일)이 업로드 되었을 때 처리 안함
			if(item.getSize()<=0)	continue;
			
			if(item.isFormField()) {
				// form-data 일 경우 
				// key, value 쌍으로 저장된 데이터일 경우 
				out.println("폼 필드 : " + item.getFieldName() + ", 값 : " + item.getString());
//				if(item.getFieldName().equals("title")) { }
			} else {
				// java.util.UUID
				UUID uid = UUID.randomUUID();
				System.out.println(uid);
				String u = uid.toString().split("-")[0];
				System.out.println(u);
				
				//필요한 추가 처리
				//	DB에 업로드한 파일의 정보를 기록해 둔다.
				//  업로드파일 PK
				//  원본 파일명
				//  저장 파일명(UUID가 적용된 파일명)
				//  업로드한 사람(userId)
				//  업로드한 시간(생략 가능)
				
				// 파일 데이터일 경우
				File up = new File(getServletContext().getRealPath("upload"), item.getName()+"_"+u);
				
				System.out.println(up);
				System.out.println(up.exists());
				
				try {
					// real path에 지정한 파일로 기록하기(실제 업로드)
					item.write(up);
					item.delete(); //임시파일 삭제하기
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
