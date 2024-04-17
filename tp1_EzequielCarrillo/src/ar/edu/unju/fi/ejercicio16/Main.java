package ar.edu.unju.fi.ejercicio16;


import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 
		 Scanner scanner = new Scanner(System.in);

	        String[] nombres = new String[5];

	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
	            nombres[i] = scanner.nextLine();
	        }

	        System.out.println("Valores guardados en el array:");
	        int index = 0;
	        while (index < nombres.length) {
	            System.out.println(nombres[index]);
	            index++;
	        }

	        System.out.println("Tamaño del array: " + nombres.length);

	        byte indiceEliminar;
	        do {
	            System.out.println("Ingrese el índice del elemento a eliminar (0-" + (nombres.length - 1) + "):");
	            indiceEliminar = scanner.nextByte();
	        } while (indiceEliminar < 0 || indiceEliminar >= nombres.length);

	        for (int i = indiceEliminar; i < nombres.length - 1; i++) {
	            nombres[i] = nombres[i + 1];
	        }
	        nombres[nombres.length - 1] = "";

	        System.out.println("Valores del arreglo después de eliminar el elemento:");
	        for (String nombre : nombres) {
	            System.out.println(nombre);
	        }

	        scanner.close();
	 }
}