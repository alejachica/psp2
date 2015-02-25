package edu.uniandes.ecos.psp2.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.uniandes.ecos.psp2.modelo.Sumatoria;

/**
 * TestCase para la clase edu.uniandes.ecos.psp2.modelo.Sumatoria
 * @author ingeneo
 *
 */
public class TestSumatoria {

	/**
	 * Lista de numero de prueba
	 */
	private List<Double> numeros;
	
	/**
	 * Objeto que se va a probar
	 */
	private Sumatoria sumatoria;

	/**
	 * Metodo que permite configurar los datos de prueba
	 */
	private void configurarDatos() {
		
		sumatoria = new Sumatoria();

		numeros = new ArrayList<Double>();
		numeros.add(1.0);
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(4.0);
		numeros.add(5.0);
	}

	/**
	 * Test method for
	 * {@link edu.uniandes.ecos.psp2.modelo.Sumatoria#calcularSumatoria(java.util.List)}
	 * .
	 */
	@Test
	public void testCalcularSumatoria() {
		
		
		double resultado = sumatoria.calcularSumatoria(numeros);
		Assert.assertEquals(15.0, resultado);
	}
}
