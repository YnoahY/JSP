package sec03.ex01;

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet {
//	private static final long serialVersionUID = 1L; =>삭제할것

	public void init() throws ServletException { //객체 생성 후 servlet컨테이너에 적재
		System.out.println("init 메서드 호출");	 //콘솔에 출력
	}

	
	protected void doPost(HttpServletRequest request/*매개변수*/, HttpServletResponse response/*매개변수*/) 
			throws ServletException, IOException { //doPost, doGet -> 전달하는 역할만 함
		
		request.setCharacterEncoding("utf-8"); //유통된 값 한글로 받음, 암호화를 복호화로 작업해야하기 때문에 사용(암호화 된 것을 한글로 풀음)
		String user_id = request.getParameter("user_id"); //user_id키에 해당하는 값을 찾아 받음 ->url에 표시 안됨:post방식이라서
		String user_pw = request.getParameter("user_pw"); //uesr_pw키에 해당하는 값을 찾아 받음
		System.out.println("아이디: " + user_id);
		System.out.println("비밀번호: " + user_pw);
	}
	

	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

}

