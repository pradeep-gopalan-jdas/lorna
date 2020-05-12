package com.javatpoint.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javatpoint.beans.Chat;
import com.javatpoint.beans.Emp;

@Controller
public class ChatController {

	@RequestMapping("/chatform")
	public ModelAndView showform(){
		return new ModelAndView("chatform","command",new Chat());
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("chat") Chat chat){
		System.out.println(chat.getHistory()+" "+chat.getMessage());
		
		//return new ModelAndView("empform","command",emp);
		return new ModelAndView("chatform","command",chat);
	}
	
	
//	@RequestMapping("/viewemp")
//	public ModelAndView viewemp(){
//		//write the code to get all employees from DAO
//		//writing manual code for easy understanding
//		List<Emp> list=new ArrayList<Emp>();
//		list.add(new Emp(1,"rahul",35000f,"S.Engineer"));
//		list.add(new Emp(2,"aditya",25000f,"IT Manager"));
//		list.add(new Emp(3,"sachin",55000f,"Care Taker"));
//		
//		return new ModelAndView("viewemp","list",list);
//	}
}
