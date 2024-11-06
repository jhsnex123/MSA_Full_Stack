package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import model.TimeVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lotto")
public class LottoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); // 여기선 한글을 안썼기 때문에 쓸일이없고 get 방식이여서 딱히 필요없음
		PrintWriter out = response.getWriter();
		String number = request.getParameter("num");
		int inputNumber = Integer.parseInt(number);
		int rand = (int)(Math.random()*6)+1; 
		
		System.out.println("전달된 값 : "+number+"추출된 값 : " +rand);
		LocalTime now = LocalTime.now();
		TimeVO lottoTime = new TimeVO(now.getHour(),now.getMinute());
		request.setAttribute("lottoTime", lottoTime);
		
		if(inputNumber == rand){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jspexam/success.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jspexam/fail.jsp");
			dispatcher.forward(request, response);
		}
		}

}
