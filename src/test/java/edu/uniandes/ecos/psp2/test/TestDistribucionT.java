package edu.uniandes.ecos.psp2.test;

import junit.framework.Assert;

import org.junit.Test;

import edu.uniandes.ecos.psp2.modelo.DistribucionT;

/**
 * @author Aleja Chica
 *
 */
public class TestDistribucionT {

	/**
	 * 
	 */
	@Test
	public void testCalcularDistribucionT() {

		DistribucionT dt = new DistribucionT();
		double gamma = dt.calcularDistribucionT(9, 0.11);
		System.out.println(gamma);

		Assert.assertEquals(0.38543693984483196, gamma);
	}

	/**
	 * 
	 */
	@Test
	public void testFuncionGammaEnteros() {
		
		DistribucionT dt = new DistribucionT();
		long gamma = dt.funcionGammaEnteros(5);
		System.out.println(gamma);

		Assert.assertEquals(24, gamma);
	}

	/**
	 * 
	 */
	@Test
	public void testFuncionGammaNoEnteros() {

		DistribucionT dt = new DistribucionT();
		double gamma = dt.funcionGammaNoEnteros(4.5);
		System.out.println(gamma);

		Assert.assertEquals(11.631728396567448, gamma);
	}

}
