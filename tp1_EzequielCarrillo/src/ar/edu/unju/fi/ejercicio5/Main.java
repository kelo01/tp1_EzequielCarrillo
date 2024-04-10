package ar.edu.unju.fi.ejercicio5;
import java.util.*;
public class Main {
	public static void main(String [] args) {
		Scanner terminal = new Scanner(System.in);
		 System.out.print("Ingrese un número entre 1 y 9 para mostrar su tabla de multiplicar: ");
	        int numero = terminal.nextInt();
	        
	        if (numero < 1 || numero > 9) {
	            System.out.println("El número debe ser entre 1 y 9.");
	        } else {
	        	for(int i=0;i<=10  ;i++ ) {
	        		System.out.println(numero +"X" +i +"=" +numero*i );
	        		
	        	}
	        
	        
	        }
		
		
		
	}
	
}
