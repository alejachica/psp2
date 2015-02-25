package edu.uniandes.ecos.psp2.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleja Chica
 *
 */
public class IntegracionNumerica {

	/**
	 * 
	 */
	private double w;

	/**
	 * 
	 */
	private int numSeg;

	/**
	 * 
	 */
	private double dof;

	/**
	 * 
	 */
	private List<Double> valoresX;

	/**
	 * 
	 */
	private DistribucionT calculadoraDistribucionT;

	/**
	 * 
	 */
	private Sumatoria sumatoria;

	/**
	 * 
	 */
	private List<Double> numerosSum;

	/**
	 * @param w
	 * @param dof
	 */
	public IntegracionNumerica(double dof, int numSeg, double valorX) {

		this.numSeg = numSeg;
		this.dof = dof;
		calculadoraDistribucionT = new DistribucionT();
		sumatoria = new Sumatoria();
		valoresX = new ArrayList<Double>();
		numerosSum = new ArrayList<Double>();
		
		w = valorX / numSeg;
		valoresX = calcularValoresX(valorX);
	}

	/**
	 * @return
	 */
	public double calcularIntegral() {

		double integral = 0;
		int i = 0;

		for (Double x : valoresX) {

			if (i == 0) {

				integral = calcularFx(x);
				numerosSum.add(integral);
				
			} else if (i < valoresX.size() - 1) {

				integral = calcularMultiplicador(i) * calcularFx(x);
				numerosSum.add(integral);

			} else if (i == valoresX.size() - 1) {

				integral = calcularFx(x);
				numerosSum.add(integral);
			}
			
			i++;
		}

		return sumatoria.calcularSumatoria(numerosSum) * (w / 3) ;
	}

	/**
	 * @param i
	 * @param valoresImpares
	 * @return
	 */
	public double calcularMultiplicador(int i) {

		double multiplicador;

		if (i == 0) {

			multiplicador = 1;

		} else if (i % 2 == 0) {

			multiplicador = 2;

		} else {

			multiplicador = 4;
		}

		return multiplicador;
	}

	/**
	 * @param x
	 */
	public double calcularFx(double x) {

		return calculadoraDistribucionT.calcularDistribucionT(dof, x);
	}

	/**
	 * @param x
	 * @return
	 */
	private List<Double> calcularValoresX(double x) {

		double tempX = 0;
		valoresX.add(tempX);

		for (int i = 1; i <= numSeg; i++) {

			tempX += w;

			valoresX.add(tempX);
		}

		return valoresX;
	}

}
