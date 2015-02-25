package edu.uniandes.ecos.psp2.controlador;

import edu.uniandes.ecos.psp2.modelo.CalculadoraIntegralNumerica;

/**
 *Clase que sirve de controlador en el patron MVC 
 * @author Aleja Chica
 */
public class Controlador {
    
    /**
     * @param dof
     * @param numSeg
     * @param valorX
     * @return
     */
    public String realizarCalculos(double dof, int numSeg, double valorX){
        
    Double resultado = 0.0;
    
        CalculadoraIntegralNumerica calc = new CalculadoraIntegralNumerica();
        
        resultado = calc.calcularIntegral(dof, numSeg, valorX);
        
        return resultado.toString();
    }
    
     
}
