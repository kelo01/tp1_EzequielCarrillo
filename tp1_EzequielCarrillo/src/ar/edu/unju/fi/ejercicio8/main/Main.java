package ar.edu.unju.fi.ejercicio8.main;
import java.util.*;

import ar.edu.unju.fi.ejercicio8.model.*;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.print("Ingresar un numero entre el 1 al 10: ");
		calculadora.setN(scanner.nextInt());
		
		calculadora.calcularSumatoria();
		calculadora.calcularProductoria();
		
		scanner.close();
	}

}
