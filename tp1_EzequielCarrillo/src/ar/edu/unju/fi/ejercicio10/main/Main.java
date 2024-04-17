package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	            Pizza pizza = new Pizza();

	            System.out.println(" Pizza " + (i + 1) + " ");
	            System.out.print("Ingrese el diámetro de la pizza (20, 30 o 40): ");
	            pizza.setDiametro(scanner.nextInt());

	            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
	            pizza.setIngredientesEspeciales(scanner.nextBoolean());

	            pizza.calcularPrecio();
	            pizza.calcularArea();

	            System.out.println("Diámetro = " + pizza.getDiametro());
	            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
	            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
	            System.out.println("Área de la pizza = " + pizza.getArea());
	            System.out.println();
	        }

	        scanner.close();
	    }
}

