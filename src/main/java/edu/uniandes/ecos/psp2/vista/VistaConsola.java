package edu.uniandes.ecos.psp2.vista;

import edu.uniandes.ecos.psp2.controlador.Controlador;

/**
 *Clase que permite probar el programa psp2 por consola. 
 *@author Aleja Chica
 */
public class VistaConsola {


	/**
	 * Metodo que permite ejecutar una aplicacion java
	 * @param args argumentos de java
	 */
	public static void main(String[] args) {

		test1();
		test2();
		test3();
	}

	/**
	 * Metodo que permite ejecutar el test1
	 */
	public static void test1() {


		double dof = 9;
		int numSeg = 10;
		double valorX = 1.1;
		
		Controlador c = new Controlador();
		String resultado = c.realizarCalculos(dof, numSeg, valorX);
		
		System.out.println(resultado);
	}

	/**
	 * Metodo que permite ejecutar el test2
	 */
	public static void test2() {

		double dof = 10;
		int numSeg = 10;
		double valorX = 1.1812;
		
		Controlador c = new Controlador();
		String resultado = c.realizarCalculos(dof, numSeg, valorX);
		
		System.out.println(resultado);
	}
	
	/**
	 * Metodo que permite ejecutar el test3
	 */
	public static void test3() {

		double dof = 30;
		int numSeg = 10;
		double valorX = 2.750;
		
		Controlador c = new Controlador();
		String resultado = c.realizarCalculos(dof, numSeg, valorX);
		
		System.out.println(resultado);
	}

}
