package edu.uniandes.ecos.psp2.modelo;

/**
 * @author Aleja Chica
 *
 */
public class CalculadoraIntegralNumerica {
	
	/**
	 * 
	 */
	public static final Double E = 0.00001;
	
	/**
	 * @param dof
	 * @param numSeg
	 * @param valorX
	 * @return
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
