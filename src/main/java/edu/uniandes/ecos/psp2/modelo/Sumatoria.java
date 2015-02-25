/**
 * 
 */
package edu.uniandes.ecos.psp2.modelo;

import java.util.List;

/**
 * @author Aleja Chica
 *
 */
public class Sumatoria {
	
	public double calcularSumatoria(List<Double> numeros){
		
		double sumatoria = 0;
		
		for (Double numero : numeros) {
			
			sumatoria += numero;
		}
		
		return sumatoria;
	}

}
