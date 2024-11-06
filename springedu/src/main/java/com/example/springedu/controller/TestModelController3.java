package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("data1")        // @Controller class에서만 정의가능  복수형으로 값을 쓸 때는 중괄호로 사용{}
public class TestModelController3 {
	@ModelAttribute("data1")           //컨맨드 메서드를 만드는 어노테이션 @ModelAttribute
	public StringBuffer createModel1() {	
		System.out.println("createModel1() 호출");
		return new StringBuffer();
	}
	@ModelAttribute("data2")             //컨맨드 메서드를 만드는 어노테이션 @ModelAttribute
	public StringBuffer createModel2() {	//컨맨드 패턴 여러개를 묶어놓은 객체를 한번에 보내는 패턴
		System.out.println("createModel2() 호출");
		return new StringBuffer();
	}
	@RequestMapping(value="/modeltest3")
	public String handle(@ModelAttribute("data1") StringBuffer vo1, 
			@ModelAttribute("data2") StringBuffer vo2, String str) {   //str이 없을경우 null이 들어감 null은 string에서만 나옴
		vo1.append(str+"#");        // append: 데이터 추가 기능
		vo2.append(str+"@");
		System.out.println("handle 에서 출력 : "+vo1 + " - " + vo2);
		System.out.println("=============================");
		return "modelResult2";
	}	
}
