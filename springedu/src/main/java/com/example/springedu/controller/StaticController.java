package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;
@Controller
public class StaticController {	
	public StaticController() {
		System.out.println("StaticController Create object");
	}
	@RequestMapping("/static")
	public ModelAndView xxx(){
		InternalResourceView view = new InternalResourceView("/staticview.html"); // 요청용 html을 부르는 객체(InternalResourceView) view이름만 리턴화면 템플릿에 있는 html을 요청하는것
		ModelAndView viewModel = new ModelAndView(view);
		return viewModel;
	}	
}




