package sec01.ex01;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/input2")
public class InputServlet2 extends HttpServlet {
       public void init() throws ServletException
       { System.out.println("init 메서드 호출");
       }
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		Enumeration enu = request.getParameterNames(); //반환 값이 Enumeration유형으로 요청 페이지의 모든 인자 이름이 저장된 목록을 반환
		//Enumeration: 열거 
		//request: 요청받은 내용, 서블릿쪽에서 받아옴
		/*request.getParameterNames(): 요청 페이지의 모든 인자 이름이 저장된 목록을 반환 */
		
		while ( enu.hasMoreElements()) { //hasMoreElements() : 읽어올 요소가 남아있는지 확인. 있으면 true, 없으면 false.
			String name = (String) enu.nextElement(); //다음 요소를 읽어 옴. Iterator의 next()와 같음
			String[] values = request.getParameterValues(name);
			for (String value : values) {
				System.out.println("name=" + name + " , value=" + value);
			}
		}
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	}

