package ar.edu.unju.fi.ejercicio14.main;
import java.util.*;

public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int tamanoArray;
	        do {
	            System.out.println("Ingrese un número entero en el rango [3,10]:");
	            tamanoArray = scanner.nextInt();
	        } while (tamanoArray < 3 || tamanoArray > 10);

	        int[] array = new int[tamanoArray];

	        for (int i = 0; i < tamanoArray; i++) {
	            System.out.println("Ingrese un número entero para la posición " + i + ":");
	            array[i] = scanner.nextInt();
	        }

	        System.out.println("Valores en el array:");
	        for (int i = 0; i < tamanoArray; i++) {
	            System.out.println("Posición " + i + ": " + array[i]);
	        }

	        int suma = 0;
	        for (int valor : array) {
	            suma += valor;
	        }

	        System.out.println("Suma de todos los valores: " + suma);

	        scanner.close();
	    }

}
