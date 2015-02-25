package edu.uniandes.ecos.psp2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.uniandes.ecos.psp2.modelo.IntegracionNumerica;

/**
 * TestCase para la clase edu.uniandes.ecos.psp2.modelo.IntegracionNumerica
 * @author ingeneo
 *
 */
public class TestIntegracionNumerica {
	
	/**
	 * Objeto que se va a probar
	 */
	private IntegracionNumerica integracionNumerica;
	
	/**
	 * Metodo que permite configurar los datos de prueba
	 */
	public void configurarDatos(){
		
		integracionNumerica = new IntegracionNumerica(9, 10, 1.1);
	}

	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.IntegracionNumerica#calcularIntegral()}.
	 */
	@Test
	public void testCalcularIntegral() {
		
		double resultado = integracionNumerica.calcularIntegral();
	}

	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.IntegracionNumerica#calcularMultiplicador(int)}.
	 */
	@Test
	public void testCalcularMultiplicador() {
		
		double multiplicador = integracionNumerica.calcularMultiplicador(2);
	}

	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.IntegracionNumerica#calcularFx(double)}.
	 */
	@Test
	public void testCalcularFx() {
		
		double resultado = integracionNumerica.calcularFx(1.1);
	}

}
