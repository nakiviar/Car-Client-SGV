package com.sgvCliente.demo.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sgvCliente.demo.model.Conductor;
import com.sgvCliente.demo.service.ConductorService;

@Controller
public class AdminController {

	@Autowired
	private ConductorService conductorService;
	
	String urlConductores = "http://localhost:8080/conductores";

//LISTAR CONDUCTORES
	@GetMapping(value = "/listarConductores")
	public String listar(Model model) {
		// http://localhost:8080/conductores

		List<Conductor> conductores= conductorService.consultarTodo();
		System.out.println(conductores);
		model.addAttribute("titulo", "Listado de conductores");
		model.addAttribute("conductores", conductores);
		return "TablaConductor";

	}
//CREAR CONDUCTORES
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String conductorNuevo(Model model) {
		Conductor conductor = new Conductor();
		model.addAttribute("conductor", conductor);
		model.addAttribute("titulo", "formulario conductores");
		return "RegistrarConductor";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String conductorGuardar(@ModelAttribute("conductor") Conductor conductor, Model model,
			RedirectAttributes ra) {
	/*	Conductor c = new Conductor("", 1231231, "Frank", "sdsad", "sadsadsa", 987987876, "jr. Alcacerez 132",
				"jose@gal.com", "A-IIIa", "X0010202", 3, 12213123, null, 1);
*/		conductor.setId_dispon(1);
		System.out.println(conductor);
		conductorService.crear(conductor);
		ra.addFlashAttribute("codigo", "OK");
		ra.addFlashAttribute("resultado ", "Cliente registrado");
		return "redirect:/TablaConductor";
	}
	
//BUSCAR CONDUCTOR
	@GetMapping(value = "/{id}")
	public String conductorPorID(@PathVariable(value="id") String id,Model model) {
		// http://localhost:8080/conductores
		Conductor con = conductorService.buscar(id);
	System.out.println(con);
		model.addAttribute("titulo", "Conductor "+con.getNombre()+" "+con.getPrimer_apellido());
		model.addAttribute("conductor", con);
		return "conductorID";
	}
	
//ACTUALIZAR CONDUCTOR	
	@GetMapping(value = "/actualizar")
	public String index(Model model) {
		Conductor c = new Conductor("E1221", 1231231, "Murph", "Peralta", "Molina", 987987876, "jr. Alcacerez 132",
				"jose@gal.com", "A-IIIa", "X0010202", 3, 12213123, null, 1);

		conductorService.actualizar(c);
		model.addAttribute("titulo", "Listado de conductores");
		return "index";

	}
//DESACTIVAR CONDUCTOR
	@GetMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") String id,Model model) {
		// http://localhost:8080/conductores
		conductorService.eliminar(id);
	System.out.println(id);
		model.addAttribute("eliminar", "Conductor desactivado");
		return "index";

	}
	//PDF
	/*/'+${conductor.id_empleado}+'/ver'**/
	/*@GetMapping(value = "/ver/{id}")
	public String vistaPDF(@PathVariable(value="id") String id,Model model) {
		// http://localhost:8080/conductores
		Conductor con = conductorService.buscar(id);

		model.addAttribute("conductor", con);
		return "pdf";

	}*/
}
