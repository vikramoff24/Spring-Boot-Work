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
	@RequestMapping("/addAliens")
	public String addAliens(Aliens aliens)
{
       Repo.save(aliens);
		return "home.jsp";
}
	@RequestMapping("/getAliens")
	public ModelAndView getAliens(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("hello.jsp");
		Aliens alien= Repo.findById(aid).orElse(new Aliens());
		mv.addObject(alien);
        return mv;
        }
@RequestMapping("/deleteAliens")
public String deleteAlien(@RequestParam int aid)
{
       Repo.deleteById(aid);	
		return "hello.jsp";
}

}