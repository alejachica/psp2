package edu.uniandes.ecos.psp2.controlador;

import edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica;

/**
 *Clase que sirve de controlador en el patron MVC 
 * @author Aleja Chica
 */
public class Controlador {
    
    /**
     * Metodo que permite realizar el calculo de la integral numerica.
     * @param dof Grados de libertad
     * @param numSeg Numero de segmentos
     * @param valorX Valor de X
     * @return String con el resultado del calculo de la integral.
     */
    public String realizarCalculos(double dof, int numSeg, double valorX){
        
		Double resultado = 0.0;

		CalculadoraIntegralNumerica calc = new CalculadoraIntegralNumerica();

		resultado = calc.calcularIntegral(dof, numSeg, valorX);

		return resultado.toString();
    }
    
     
}
