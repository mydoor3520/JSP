package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 서블릿(Servlet)
 *  - 요청을 보낼 수 있는 자바 파일
 *  - 규칙을 지켜서 생성할 때만 Apache Tomcat이 서비스를 수행
 * 	[규칙]
 * 	[1] Servlet에 소속될 것(javax.servlet.http.HttpServlet)
 * 	[2] 이 파일에 연동될 가상의 주소를 부여(test.itbank)
 * 		- WEB-INF/web.xml 파일에 부여
 * 		- annotation을 이용 
 * [3] 사용자가 요청한 내용을 처리할 수 있는 기능을 구현
 */
public class TestServlet extends HttpServlet{
	
	/**
	 * 요청 처리 메소드 : 메뉴얼
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		사용자가 뭐라도 볼 수 있게 코드를 작성
//		System.out.println("hello");//사용자가 볼 수 없음
		
//		이미 구현된 전송도구를 가져와서 사용하고 종료
		resp.setContentType("text/plain; charset=EUC-KR");
		PrintWriter out = resp.getWriter();
		out.println("헌혈하실분들 5층으로");
		out.println("남으실분들은 문제 푸세요~");
		out.println("DB의 menu 테이블 목록을 구하여 화면에 출력");
		out.close();
	}
}










