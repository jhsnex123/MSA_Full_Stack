package filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/*" })         // 모든 대상한테 요청(request)이 올 때 한글 필터를 실행하라는 뜻
public class HangulFilter implements Filter {

	public HangulFilter() {
		System.out.println("HangulFilter 객체 생성...");
	}
	
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest req = (HttpServletRequest)request;
    	if (req.getMethod().equals("POST"))            // get 방식은 응답(response)이라 필요없음
    		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
	}
}
