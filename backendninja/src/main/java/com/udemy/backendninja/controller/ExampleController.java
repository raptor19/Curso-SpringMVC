package com.udemy.backendninja.controller;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendninja.component.ExampleComponent;
import com.udemy.backendninja.model.Persona;
import com.udemy.backendninja.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {

	public static final String EXAMPLE_VIEW = "example";
	// inyeccion de un componente
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	//Inyeccion de un Servicio
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	
	
	//Formas de realizar una peticion Get
	// Primera forma
	
	@GetMapping("/exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		model.addAttribute("personas", exampleService.getListPeople());
		return EXAMPLE_VIEW;
	}
	
	// Segunda Forma
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("persona", new Persona("Nicolas","Almiron",25));
		return mav;
	}
	
	/** Este metodo devuelve una lista cargada con objetos de la clase Persona
	
	private List<Persona> getPersonas() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Jose","Rojas",24));
		personas.add(new Persona("Marcos","Alonso",22));
		personas.add(new Persona("Fidel","Martinez",29));
		return personas;
	} **/
	
	
	
	
	

	
}
