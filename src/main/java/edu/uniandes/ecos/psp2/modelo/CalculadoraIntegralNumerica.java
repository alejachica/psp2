package edu.uniandes.ecos.psp2.modelo;

/**
 * Clase que permite calcular las integrales numericas, hasta que: integralInicial - integralDefinitiva < E
 * @author Aleja Chica
 *
 */
public class CalculadoraIntegralNumerica {
	
	/**
	 * valor del error aceptable
	 */
	public static final Double E = 0.00001;
	
	/**
	 * Metodo que permite realizar el calculo de la integral numerica.
	 * @param dof Grados de libertad
     * @param numSeg Numero de segmentos
     * @param valorX Valor de X
	 * @return double con el resultado del calculo de la integral.
	 */
	public double calcularIntegral(double dof, int numSeg, double valorX) {
		
		IntegracionNumerica in = new IntegracionNumerica(dof, numSeg, valorX);
		double integralInicial = in.calcularIntegral();
		
		numSeg *= 2;
		IntegracionNumerica in2 = new IntegracionNumerica(dof, numSeg, valorX);
		double integralDefinitiva = in2.calcularIntegral();
		
		while((integralInicial - integralDefinitiva) > E){
			
			integralInicial = integralDefinitiva;
			numSeg *= 2;
			
			in2 = new IntegracionNumerica(dof, numSeg, valorX);
			integralDefinitiva = in2.calcularIntegral();
		}
		
		return integralDefinitiva;
	}

}
