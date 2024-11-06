package com.example.springlab.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @RequestMapping(value="/calccontroller")
    public ModelAndView proc(HttpServletRequest req, int num1, int num2, String oper ){
        ModelAndView mav = new ModelAndView();
        mav.addObject("refinfo", req.getHeader("referer"));

        switch (oper){
            case "+" :
                mav.addObject("sum", num1 + num2);
                mav.setViewName("calcResult");
                break;
           case "-" :
                mav.addObject("sum", num1 - num2);
                mav.setViewName("calcResult");
                break;
            case "*" :
                mav.addObject("sum", num1 * num2);
                mav.setViewName("calcResult");
                break;
            default:
                if(num2 == 0){
                  mav.addObject("error", "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!");
                  mav.setViewName("errorResult");
                  return mav;
                }else{
                    mav.addObject("sum", num1 / num2);
                    mav.setViewName("calcResult");
                    break;
                }

        }
        return mav;

    }
}
