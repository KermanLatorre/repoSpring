package com.mikeldi.demo.component;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.mikeldi.demo.model.Persona;

@Component("ejemploComponent")
public class EjemploComponent {
	
	public ArrayList<Persona> getPersonas(){
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(new Persona("Maria", "Perez", "4743747", 10));
		listaPersona.add(new Persona("Leire", "Gutierrez", "374847438", 27));
		listaPersona.add(new Persona("Lorea", "Bazterra", "7473837Y", 30));
		listaPersona.add(new Persona("Elena", "Dominguez", "3332222333", 35));
		listaPersona.add(new Persona("Ander", "Díez", "888837487", 25));
		return listaPersona;
	}
	
	private static final Log LOG= LogFactory.getLog(EjemploComponent.class);
	
	public void saludito() {
		LOG.info("Mensaje desde el metodo saludito");
	}
}
