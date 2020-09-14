package com.example.demo.controller;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Aliens;

@Controller
public class AlienController 
{
	@Autowired
AlienRepo Repo;
	@RequestMapping("/aliens")
	@ResponseBody
public List<Aliens> getAliens()
{
		return Repo.findAll();
}
	@RequestMapping("/alien/{aid}")
	@ResponseBody
public Optional<Aliens> getAlien(@PathVariable("aid") int aid)
{
		return Repo.findById(aid);
}

}
