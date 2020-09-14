package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

	@Component
	
public class Alien {
@Autowired
		private laptop lf;
	Alien()
	{
		System.out.println("obj is created");
	}
		void show()
{
			lf.get();
	System.out.println("vikram");
}
}
