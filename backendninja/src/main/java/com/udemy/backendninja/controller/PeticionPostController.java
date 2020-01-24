package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.backendninja.model.Persona;

@Controller
@RequestMapping("example3")
public class PeticionPostController {
	
	// Logs
	
	private static final Log LOGGER = LogFactory.getLog(PeticionPostController.class);
	
	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";
	
	@GetMapping("/showform")
	public String getForm(Model model) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR_TRACE");
		LOGGER.debug("DEBUG_TRACE");
		model.addAttribute("persona", new Persona());
		return FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("persona") Persona persona ) {
		LOGGER.info("METHOD: 'addperson ' -- PARAMS: '" + persona + "'");
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("persona", persona);
		LOGGER.info("TEMPLATE: '" + RESULT_VIEW + "' -- DATA: '" + persona + "'");
		return mav;
	}
	
	// Redirecciones
	
	/*
	@GetMapping("/")
	public String redirect() {
		return "redirect:/example3/showform";
	}*/
	
	@GetMapping("/")
	public RedirectView redir() {
		return new RedirectView(FORM_VIEW);
	}
	
	
	
}
