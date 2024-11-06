package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

	   
		String stName = request.getParameter("stname");
		String genDer = request.getParameter("gender");
		String addReq[] = request.getParameterValues("addReq");
		String date = request.getParameter("date");
		

		PrintWriter out = response.getWriter();
		if(stName == null || stName.length() == 0) {
			RequestDispatcher rd = 
					request.getRequestDispatcher("/first.html"); 
			rd.forward(request,  response);
		}
		if(genDer == null || genDer.length() == 0) {
			response.sendRedirect("http://www.daum.net/");
		}
		
		
		out.println("<h1>"+stName+"님의 예약내용</h1>");
		out.println("<hr>");
		out.println("<li> 룸 : "+genDer+"</il>");
		
		if(addReq == null || addReq.length == 0) {
			out.print("<li>추가요청사항: 없음</li>");
		}
		else {
			out.print("<li>추가요청사항 :");
			for(int i=0; i <= addReq.length; i++) {
				out.print(addReq[i]);
				if(i < addReq.length - 1) {
					out.print(",");
				}
			}
		}
		
		if(date.equals("")) {
			out.print("없음");
		}else {
			LocalDate parse = LocalDate.parse(date);
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
			String dateString = dateTimeFormatter.format(parse);
			out.print("<li>예약날짜 : "+dateString);
		} 
		out.print("<br>");
		out.print("<a href='"+request.getHeader("referer")+"'>예약입력화면으로</a>");
		
	}

}
