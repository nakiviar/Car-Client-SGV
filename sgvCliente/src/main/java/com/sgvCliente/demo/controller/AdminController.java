package com.sgvCliente.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.sgvCliente.demo.model.Conductor;

@Controller
public class AdminController {

	
	private RestTemplate restTemp = new RestTemplate();

	@GetMapping(value = "/listarConductores")
	public String listar(Model model) {
		// http://localhost:8080/conductores
		String url = "http://localhost:8080/conductores";
		Conductor[] conductores = restTemp.getForObject(url, Conductor[].class);

		model.addAttribute("titulo", "Listado de conductores");
		model.addAttribute("conductores", conductores);
		return "listar";
		
		
	}
	@GetMapping(value = "")
	public String index(Model model) {

		model.addAttribute("titulo", "Listado de conductores");
		return "index";
		
		
	}
	

}
