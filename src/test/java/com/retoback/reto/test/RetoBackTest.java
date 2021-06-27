package com.retoback.reto.test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.retoback.modelo.Satelite;
import com.retoback.modelo.SatelitesList;
import com.retoback.reto.TopsecretController;


class RetoBackTest {

	@Test
	public void testMensaje() {
		TopsecretController top = new TopsecretController();
		String [] mensaje = {"Hola","Esto","Es","un","mensaje"};
		
		String [] mensajeRecibido = top.getMessage(mensaje).split(" ");
		int tamano = mensajeRecibido.length;
		int tamanoEsperado = 5;
		
		System.out.println(top.getMessage(mensaje));
		
		assertEquals(tamanoEsperado, tamano);
	}
	
	@Test
	public void testSatelites() {
		Satelite satelite1 = new Satelite();
		satelite1.setName("kenobi");
		String [] mensaje = {"este", "", "", "mensaje", ""};
		//String [] mensaje = null;
		satelite1.setMessage(mensaje);
		satelite1.setDistance(100.0);
		
		List<Satelite> satellites = new ArrayList<Satelite>();
		
		satellites.add(satelite1);
		
		SatelitesList listaSatelites = new SatelitesList();
		listaSatelites.setSatellites(satellites);
		
		TopsecretController top = new TopsecretController();
		
		assertNotNull(top.comunicacionNave(listaSatelites).getMessage());
	}

}
