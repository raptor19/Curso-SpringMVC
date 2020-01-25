package com.udemy.backendninja.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.backendninja.entity.Curso;

@Repository("cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Serializable>{
	public abstract Curso findById(int precio);
	public abstract Curso findByPrice(double precio);
	public abstract Curso findByPriceAndName(double precio,String nombre);
	public abstract List<Curso> findByNameOrderByHours(String nombre);
	public abstract Curso findByNameOrPrice(String nombre,double precio);
}
