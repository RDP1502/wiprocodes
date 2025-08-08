package com.wipro.letsgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.entity.LetsGo;
import com.wipro.letsgo.service.LetsGoService;

@RestController
@RequestMapping("/move")
public class LetsGoController {
	
	@Autowired
	LetsGoService letsGoService;
	
	@PostMapping
	public String save(@RequestBody LetsGo letsGo) {
		return letsGoService.save(letsGo);
		
	}
	
	@GetMapping
	public List<LetsGo> findAll(){
		return letsGoService.findAll();
	}

}
