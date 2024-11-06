package core;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/flow")
public class FlowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FlowServlet() {
        super();
        System.out.println("FlowServlet 객체 생성...."); // 서블릿 최초요청시 호출되는(객체)
    }
	public void init(ServletConfig config) throws ServletException { // 서블릿 최초요청시 호출되는(메서드) 
		System.out.println("init() 메서드 호출.....");
	}
	public void destroy() {       // 서블릿 마지막 요청시 호출되는(메서드) 
		System.out.println("destroy() 메서드 호출....");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  // 클라이언트한테 요청 올 떄마다 호출되는 기능
		System.out.println("service() 메서드 호출.....");
	}

}
