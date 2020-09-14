package com.example.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Aliens;

@Controller
public class AlienController 
{
	@Autowired
AlienRepo Repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	//adding elements into the table.
	@RequestMapping("/addAliens")
	public String addAliens(Aliens aliens)
{
       Repo.save(aliens);
		return "home.jsp";
}
	//finding using aid
	@RequestMapping("/getAliens")
	public ModelAndView getAliens(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("hello.jsp");
		Aliens alien= Repo.findById(aid).orElse(new Aliens());
		System.out.println(Repo.findByTech("java"));   		System.out.println(Repo.findByaidGreaterThan(102)); 
		
		System.out.println(Repo.findByTechSorted("java"));  
		
		//implemented method
		mv.addObject(alien);
        return mv;
        }
	
	//deleting using aid
}
