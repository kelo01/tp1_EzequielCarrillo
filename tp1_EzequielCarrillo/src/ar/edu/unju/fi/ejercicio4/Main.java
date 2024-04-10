package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner consola = new Scanner(System.in);
		
		System.out.println("---INGRESE UN NUMERO ENTERO ENTRE [0-10]---");
		int numero = consola.nextInt();
		
		if (numero <1 || numero >10) {
			System.out.println("El número debe ser entre 1 al 10.");
		}
		else {
		int  i =1;
		int factorial=1;
			while(numero>=i ){
				factorial*= i;
				i++;
				
			}
			 System.out.println("El factorial de " + numero + " es " + factorial);
		}
			
	}
	
	
	
}
