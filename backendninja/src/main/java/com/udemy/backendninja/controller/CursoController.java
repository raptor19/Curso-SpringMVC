package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.udemy.backendninja.entity.Curso;
import com.udemy.backendninja.service.CursoService;

@Controller
@RequestMapping("/courses")
public class CursoController {

	private static final Log LOG = LogFactory.getLog(CursoController.class); 
	private static final String COURSE_VIEW = "courses";
	@Autowired
	@Qualifier("cursoServiceImpl")
	private CursoService cursoService;
	
	
	@GetMapping("/listcourses")
	public ModelAndView listAllCourses() {
		LOG.info("Call: " + "listAllCourses()");
		ModelAndView mav = new ModelAndView(COURSE_VIEW);
		mav.addObject("cursos", cursoService.listAllCourses());
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute("curso") Curso curso) {
		LOG.info("Call: " + "addCourse()" + " -- Param:	"+ curso.toString());
		cursoService.addCourse(curso);
		return "redirect:/courses/listcourses";
	}
	
	
}
