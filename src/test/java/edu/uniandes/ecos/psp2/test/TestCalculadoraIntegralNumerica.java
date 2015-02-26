package edu.uniandes.ecos.psp2.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica;
import edu.uniandes.ecos.psp2.modelo.DistribucionT;

/**
 * TestCase para la clase edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica
 * @author ingeneo
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
//		Assert.assertEquals(15.0, resultado);
	}
	
	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica#calcularIntegral(double, int, double)}.
	 */
	@Test
	public void test2CalcularIntegral() {
		
		double resultado = calculadoraIntegralNumerica.calcularIntegral(10, 10, 1.1812);
//		Assert.assertEquals(15.0, resultado);
	}
	
	/**
	 * Test method for {@link edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica#calcularIntegral(double, int, double)}.
	 */
	@Test
	public void test3CalcularIntegral() {
		
		double resultado = calculadoraIntegralNumerica.calcularIntegral(30, 10, 2.750);
//		Assert.assertEquals(15.0, resultado);
	}

}
