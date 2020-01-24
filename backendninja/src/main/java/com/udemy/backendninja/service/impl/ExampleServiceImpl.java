package com.udemy.backendninja.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.backendninja.model.Persona;
import com.udemy.backendninja.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Persona> getListPeople() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Jose","Rojas",24));
		personas.add(new Persona("Marcos","Alonso",22));
		personas.add(new Persona("Fidel","Martinez",29));
		LOG.info("Hello from service");
		return personas;
	}

}
