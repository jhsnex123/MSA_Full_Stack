package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String time = sdf.format(now);
		String guestName = request.getParameter("name");
		String guestMemo = request.getParameter("memo");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+guestName+"님이"+time+"에 남긴 글입니다.</h1>");
		out.println("<hr>");
		out.println("<h2>"+guestMemo+"</h2>");
		out.print("<a href='"+request.getHeader("referer")+"'>입력화면으로</a>");
		out.close();
		
	}

}
