package sec03.ex02;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet4
 */
@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

/* doGet(), doPost(): 전달하는 방식이므로 추가 메소드(doHandle) 만들어야함
 * doHandle(): doHandle()추가 메소드 만들어서 받은 doPost(doGet)의 매개변수 값을 전송,전달함
 * doHandle이라고 명칭하지 않아도 되지만 관습적인 약속이 있으므로 doHandle을 사용할 것.
*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doGet 메서드 호출"); //확인작업, 출력 안될 시 doGet부분의 오류를 확인
		doHandle(request, response); //doGet방식으로 요청시 doHandle() 호출
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메서드 호출");//확인작업, 출력 안될 시 doPost부분의 오류를 확인
		doHandle(request, response); //doPost방식으로 요청시 doHandle() 호출
	}
	
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		System.out.println("doHandle 메서드 호출");//확인작업, 출력 안될 시 doHandle부분의 오류를 확인
		String user_pw = request.getParameter("user_pw");
		
		System.out.println("아이디: " + user_id);
		System.out.println("비밀번호 : " + user_pw);
	}

}
