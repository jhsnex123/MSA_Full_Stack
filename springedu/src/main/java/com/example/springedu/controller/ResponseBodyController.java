package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springedu.domain.MyModel;
@Controller
public class ResponseBodyController {
	@RequestMapping(value = "/body/text/{id}", produces="text/plain; charset=utf-8")
	@ResponseBody       // @Controller 매서드를 직접 응답할 때마다  @ResponseBody를 넣어야함
	public String getByIdInTEXT(@PathVariable String id) {
		return "<h1>컨트롤러에서 바로 문자열을 리턴해요 : "+id+"</h1>";
	}
	@RequestMapping(value = "/body/htmltext/{id}", 	produces="text/html; charset=utf-8")
	@ResponseBody		// @Controller 매서드를 직접 응답할 때마다  @ResponseBody를 넣어야함
	public String getByIdInHTMLTEXT(@PathVariable String id) {
		return "<h1>컨트롤러에서 바로 HTML 문자열을 리턴해요 : " + id +"</h1>";
	}
	@RequestMapping(value = "/body/json/{id}", produces = "application/json; charset=utf-8")  // text/json
	@ResponseBody	// @Controller 매서드를 직접 응답할 때마다  @ResponseBody를 넣어야함
	public MyModel getByIdInJSON(@PathVariable String id) {
		MyModel my = new MyModel();
		my.setFlowerName("장미");
		my.setNum(5);
		my.setId(id);
		System.out.println(my);
		return my;
	}
}
