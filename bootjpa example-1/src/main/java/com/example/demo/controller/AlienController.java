package com.example.demo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
