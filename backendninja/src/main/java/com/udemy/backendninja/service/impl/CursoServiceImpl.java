package com.udemy.backendninja.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.udemy.backendninja.entity.Curso;
import com.udemy.backendninja.repository.CursoRepository;
import com.udemy.backendninja.service.CursoService;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService{

	private static final Log LOG = LogFactory.getLog(CursoServiceImpl.class);
	@Autowired
	@Qualifier("cursoRepository")
	private CursoRepository cursoRepository;
	// Listar todos los cursos
	@Override
	public List<Curso> listAllCourses() {
		LOG.info("Call: "+ "listAllCourses()");
		return cursoRepository.findAll();
	}
	// Agregar curso
	@Override
	public Curso addCourse(Curso curso) {
		LOG.info("Call: "+ "addCourse()");
		return cursoRepository.save(curso);
	}
	// Eliminar curso
	@Override
	public int removeCurse(int id) {
		LOG.info("Call: "+ "removeCourse()");
		return cursoRepository.delete(id);
	}
	// Actualizar curso
	@Override
	public Curso updateCourse(Curso curso) {
		LOG.info("Call: "+ "updateCourse()");
		return cursoRepository.save(curso);
	}

}
