package com.org.cancer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("test")
public class Hello {
	@RequestMapping("show01")
	public ModelAndView show01() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "第一个程序");
		modelAndView.setViewName("hello");
		return modelAndView;
		
	} 
	@RequestMapping("/**/show02")
	public ModelAndView show02() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "第一个程序");
		modelAndView.setViewName("hello");
		return modelAndView;
		
	} 

	@RequestMapping("{item1}/{item2}")
	public ModelAndView show03(@PathVariable("item1") String item1,
			@PathVariable("item2") String item2) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "第一个程序"+item1+"--->"+item2);
		modelAndView.setViewName("hello");
		return modelAndView;
		
	} 
}
