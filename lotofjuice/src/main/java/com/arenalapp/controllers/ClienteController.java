package com.arenalapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {
	
	@RequestMapping("/")
	public String listar(Model model) {
		model.addAttribute("untitulo", "listado de pergaminos");
		return "index";
	}
}
