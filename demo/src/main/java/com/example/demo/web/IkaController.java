package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class IkaController {
	
	@GetMapping("hello2")
	public String sayGreetings(@RequestParam (name="name") String nimi, 
			@RequestParam(name="age") int ika, 
			Model model) {
		model.addAttribute("nimi", nimi);
		model.addAttribute("ika", ika);
		return "ika";
	}

}
