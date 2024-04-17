package ar.edu.unju.fi.ejercicio13.main;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int[] arreglox = new int[8];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<arreglox.length; i++) {
			
			System.out.println("Ingrese un entero: ");
			arreglox[i] = scanner.nextInt();
		}
		
		for(int i=0 ; i<arreglox.length; i++) {
			
			System.out.println("Posición" + " " + i + ":" + " " + arreglox[i]);
		}
		
		scanner.close();
	}
}