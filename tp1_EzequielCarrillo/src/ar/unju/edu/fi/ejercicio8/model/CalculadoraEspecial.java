package ar.unju.edu.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void calcularSumatoria() {
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			
			sum += (Math.pow(((k * (k+1)) / 2), 2));
		}
		System.out.print("El resultado de la sumatoria de " + n + " es " + sum + "\n");
	}
	
	public void calcularProductoria() {
		int prod = 1;
		for(int k = 1; k <= n; k++) {
			prod *= k * (k + 4);
		}
		System.out.print("El resultado de la productoria de " + n + " es " + prod + "\n" );
	}	
	
}