package com.vamshi.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vamshi.springdemo.entity.Details;
import com.vamshi.springdemo.service.CoronaService;


@Controller
public class CoronaController {

	@Autowired
	private CoronaService coronaService;
	
	@GetMapping("/CoronaData")
	public String getDataFromApi(Model theModel)throws Exception {

		Details theDetails = coronaService.getDetails();
		
		theModel.addAttribute("worlddetails", theDetails);
	
		return "corona-form";
	}
}
