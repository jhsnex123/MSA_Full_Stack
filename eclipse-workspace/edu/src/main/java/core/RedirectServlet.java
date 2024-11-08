package core;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RedirectServlet 수행");
		/* response.sendRedirect("/edu/first.html"); */ // 절대 URI
		response.sendRedirect("http://www.naver.com/");          //redirect는 내가 연결할 url만 지정해주면 된다
	}
}






