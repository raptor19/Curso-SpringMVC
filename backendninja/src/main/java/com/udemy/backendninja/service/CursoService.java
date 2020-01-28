package com.udemy.backendninja.service;

import java.util.List;

import com.udemy.backendninja.entity.Curso;

public interface CursoService {
	public abstract List<Curso> listAllCourses();
	public abstract Curso addCourse(Curso curso);
	public abstract int removeCurse(int id);
	public abstract Curso updateCourse(Curso curso);
}
