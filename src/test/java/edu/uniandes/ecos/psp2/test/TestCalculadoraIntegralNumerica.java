package edu.uniandes.ecos.psp2.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica;

/**
 * TestCase para la clase edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica
 * @author Aleja Chica
 *
 */
public class TestCalculadoraIntegralNumerica {
	
	/**
	 * Objeto que se va a probar
	 */
	private CalculadoraIntegralNumerica calculadoraIntegralNumerica;
	
	/**
	 * Metodo que permite configurar los datos de prueba
	 */
	@Before
	public void configurarDatos(){
		
		calculadoraIntegralNumerica = new CalculadoraIntegralNumerica();
	}

	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica#calcularIntegral(double, int, double)}.
	 */
	@Test
	public void test1CalcularIntegral() {
		
		double resultado = calculadoraIntegralNumerica.calcularIntegral(9, 10, 1.1);
		Assert.assertEquals(0.35005863689720107, resultado);
	}
	
	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica#calcularIntegral(double, int, double)}.
	 */
	@Test
	public void test2CalcularIntegral() {
		
		double resultado = calculadoraIntegralNumerica.calcularIntegral(10, 10, 1.1812);
		Assert.assertEquals(0.3675734051525516, resultado);
	}
	
	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica#calcularIntegral(double, int, double)}.
	 */
	@Test
	public void test3CalcularIntegral() {
		
		double resultado = calculadoraIntegralNumerica.calcularIntegral(30, 10, 2.750);
		Assert.assertEquals(0.4949998582485177, resultado);
	}

}
