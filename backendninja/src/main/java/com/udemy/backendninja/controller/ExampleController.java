package com.udemy.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.model.Persona;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "example";
	
	// Primera forma
	
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("personas", getPersonas());
		return EXAMPLE_VIEW;
	}
	
	// Segunda Forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("persona", new Persona("Nicolas","Almiron",25));
		return mav;
	}
	
	private List<Persona> getPersonas() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Jose","Rojas",24));
		personas.add(new Persona("Marcos","Alonso",22));
		personas.add(new Persona("Fidel","Martinez",29));
		return personas;
	}

	
}
