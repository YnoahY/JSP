package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8"); //암호를 utf-8로 복호화, 유통된 값을 한글로 받음
		response.setContentType("text/html; charset=utf-8");
		/*html문서의 인코딩 방식을 지정
		 * 클라이언트에게 응답할 페이지에 대한 환경설정, text나 html보여주고 utf-8언어를 사용 그 이후에 response.getWriter() 메소드로 출력 스트림 객체를 얻어 와야 한다.
		 */
		PrintWriter out = response.getWriter();//웹페이지 응답 출력(=사용자의 화면에 결과값 출력)
		/*PrintWriter는 writer를 상속받아 사용, 개체의 형식화된 표현을 텍스트 출력 스트림에 출력. PrintStream에 있는 모든 출력 메서드를 구현.*/
		/*HttpServletResponse로 부터 출력 스트림 객체 getWriter()를 가져와 PrintWriter형의 매개변수 out에 대입하여 클라이언트에게 결과를 반환함*/

		String id = request.getParameter("user_id"); // user_id의 입력값을 String형의 매개변수 id에 대입
		String pw = request.getParameter("user_pw");
		String address = request.getParameter("user_address");
		System.out.println("아이디: " + id); //console 출력
		System.out.println("비밀번호: " + pw);
		
		
		/*html형태로 출력: 사용자가 보이는 화면*/
		String data = "<html>"; //data 누적해서 String data에 넣음
		data += "<boyd>";
		data += "아이디: " + id;
		data += "<br>";
		data += "비밀번호: " + pw;
		data += "<br>";
		data += "주소: " + address;
		data += "</body>";
		data += "</html>";
		
		out.print(data); //out.print -> 웹 출력, print-> 시스템 표준 출력, console출력
	}
}
