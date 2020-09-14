package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	public ModelAndView home(alien alien)
	{	 
	ModelAndView mv=new ModelAndView();
	mv.addObject("obj",alien); //data
	mv.setViewName("home");   //view
	return mv;
	}
	

}
;