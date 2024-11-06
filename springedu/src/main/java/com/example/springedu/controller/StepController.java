package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springedu.domain.StepVO;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StepController {		
	@PostMapping("/step")
	public String memberHandle(@ModelAttribute("kkk") StepVO vo) {
		if(vo.getAge() < 18)
			return "redirect:/stepForm.html"; // 뒤로가기 버튼 만들때 이런식으로 구현
		System.out.println("[ 전달된 Command 객체의 정보 ]");
		System.out.println(vo.getName());
		System.out.println(vo.getPhoneNumber());
		System.out.println(vo.getAge());
		return  "stepOutput";
	}
}
