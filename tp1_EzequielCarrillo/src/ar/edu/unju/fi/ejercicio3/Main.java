package ar.edu.unju.fi.ejercicio3;
import java.util.*;

public class Main {
	public static void main(String [] args) {
	
		Scanner consola = new Scanner(System.in);
		
		System.out.println("---INGRESE UN NUMERO ENTERO---");
		
		int numero = consola.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("EL NUMERO INGRESADO ES PAR SU TRIPLE ES =" +numero*3);		
		}
		else {
			
			System.out.println("EL NUMERO INGRESADO ES IMPAR SU DOBLE  ES =" +numero*2);		
			
		}
		
		
		
			

	}
	
}
