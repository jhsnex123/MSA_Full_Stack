package com.example.springedu.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component          //애를 쓰면 필터를 사용하느것    주석처리 확인 ㅋ
@Slf4j
@Order(2)           // 필터 순서 구분
public class TestFilter1 implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                        throws IOException, ServletException {        // 서블릿에선 서비스 객체랑 비슷하다
        log.info("[필터1] 요청 자원 수행 전");
        chain.doFilter(request, response);
        log.info("[필터1] 요청 자원 수행 후");
    }
}
