package ar.edu.unju.fi.ejercicio9.main;

import ar.edu.unju.fi.ejercicio9.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            Producto producto = new Producto();

            System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Código: ");
            producto.setCodigo(Integer.parseInt(scanner.nextLine()));

            System.out.print("Precio: ");
            producto.setPrecio(Double.parseDouble(scanner.nextLine()));

            System.out.print("Descuento (%): ");
            producto.setDescuento(Integer.parseInt(scanner.nextLine()));

            System.out.println("Datos del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.calcularDescuento());
            System.out.println();
        }

        scanner.close();
    }
}