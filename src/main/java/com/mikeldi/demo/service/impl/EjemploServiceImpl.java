package com.mikeldi.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mikeldi.demo.model.Persona;
import com.mikeldi.demo.service.EjemploService;

@Service("ejemploservicio")
public class EjemploServiceImpl implements EjemploService {

	@Override
	public List<Persona> getPersona() {
		List<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(new Persona("Maria", "Gutierrez", "444Z", 10));
		listaPersona.add(new Persona("Sonia", "Lersundi", "555F", 27));
		listaPersona.add(new Persona("Manolo", "Garcia", "666J", 30));
		listaPersona.add(new Persona("Juan", "Sanchez", "777K", 35));
		
		return listaPersona;
		
	}

}
