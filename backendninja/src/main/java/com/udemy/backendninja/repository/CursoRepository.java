package com.udemy.backendninja.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.entity.Curso;

@Repository("cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Serializable>{
	public abstract Curso findById(int precio);
	public abstract Curso findByPrecio(double precio);
	public abstract int delete(int id);
	//public abstract Curso findByPrecioAndNombre(double precio,String nombre);
	//public abstract List<Curso> findByNombreOrderByHours(String nombre);
	//public abstract Curso findByNameOrPrice(String nombre,double precio);
}
