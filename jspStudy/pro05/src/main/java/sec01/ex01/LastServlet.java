package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LastServlet extends HttpServlet{ //웹 사용 위해 HttpServlet을 FirstServlet(Class)가 extends로 상속
@Override
public void init() throws ServletException { //throws ServletException: web.xml을 이용해 웹 애플리케이션에서 발생하는 오류를 처리	
	System.out.println("init 메서드 호출");
}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	System.out.println("doGet 메서드 호출");
}
@Override
public void destroy() {
	System.out.println("destroy 메서드 호출");
}
}
