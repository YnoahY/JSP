package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		System.out.println("init 메서드 호출");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //요청 응답하는 text 부분 utf-8로 처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); // 웹출력하는 객체 생성
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("아이디: " + id); //로버, id pw 출력 안될 시 위의 구문 확인
		System.out.println("아이디: " + pw);
		
		if(id != null && (id.length() != 0)) {
			if (id.equals("admin")) { //id가 admin과 같으면 {}내 실행
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'> 관리자로 로그인 하셨습니다. </font>");
				out.print("<input type=button value='회원정보 수정하기'/>");
				out.print("<input type=button value='회원정보 삭제하기'/>");
				out.print("</body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<body>");
				out.print(id +  "님!! 로그인 하셨습니다.");
				out.print("</body>");
				out.print("</html>");
			}
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("아이디를 입력하세요.");
			out.print("<br>");			
			out.print("<a href='http://localhost:8080/pro06/login.html'> 로그인창으로 이동</a>");			
			out.print("</body>");
			out.print("</html>");
		}
	}

}
