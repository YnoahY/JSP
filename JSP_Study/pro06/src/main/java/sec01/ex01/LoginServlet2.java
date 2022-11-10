package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2") // 어노테이션을 이용한 uri 맵핑 방식
	public class LoginServlet2 extends HttpServlet // 서블릿은 HttpServlet을 상속해서 구현됨
	{
		public void init() throws ServletException {
			System.out.println("init 메서드 호출");
		}
		
		protected void doGet(HttpServletRequest request/*매개변수*/, HttpServletResponse response/*매개변수*/)
							/*id, pw 입력값 받음*/					/*응답은 HttpServletResponse 객체 이용*/
		// doGet() : get 방식으로 호출시 호출되는 메서드    
		/* HttpServletRequest : request 객체 -> 사용자의 요청 정보를 알아낼 수 있다.     
		 * HttpServletResponse : response 객체 -> 응답에 관련된 객체이다. */
		
		throws ServletException, IOException
		{
			request.setCharacterEncoding("utf-8");//들어오는 파라미터를 UTF-8로 해석
			/*response.setCharacterEncoding("UTF-8"); : 서블릿이 HTML 파일을 만들 때 UTF-8 로 쓰기*/
			response.setContentType("text/html; charset=utf-8"); ///HTML이 UTF-8 형식이라는 것을 브라우저에게 알림
			// 응답 문서에 출력하기 위한 PrintWriter 객체를 가지고 옴
			PrintWriter out = response.getWriter(); //출력 도구용 출력 스트림에 텍스트를 보내겠다
			/*자바에서 웹으로 데이터 출력*/
			String id = request.getParameter("user_id");
			String pw = request.getParameter("user_pw");
			
			
			String data = "<html>";
			data += "<body>";
			data += "아이디 : " + id;
			data += "<br>";
			data += "패스워드 : " + pw;
			data += "</body>";
			data += "</html>";
			
			out.print(data); //매개변수 out이 .print(data)를 호출
		}
		public void destroy()
		{System.out.println("destroy 메서드 호출");
	}

}

