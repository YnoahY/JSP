package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; //요청과 응답
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/Third") //호출, 동일 명칭 다른곳에 있으면 충돌나서 안열림. 톰캣에서 관리하는 컨테이너에서 하나여야함
public class ThirdServlet extends HttpServlet { //class ThirdServlet 실행
	private static final long serialVersionUID = 1L; //복붙시 다른곳에서 충돌나면서 안열림, 새로 생성할 것
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() { //생성자
        super(); //super 메소드로 HttpServlet호출 후 객체생성
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException { // init: 메모리 점유, //ServletException 마무리 하도록 throws 하기
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() { //destroy:메소드 종료시 호출- 있어도 되고 없어도 되고, 가베지 컬렉터가 자동으로 삭제
		////처리구문이 잇더라도 의무적으로 실행x 가베지 컬렉션에 의해 실행-직전까지 사용햇던 서블릿 destroy실행x, 메모리 객체에서 삭제 안함
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response/*응답*/.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost/*폼안에 호출*/(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
