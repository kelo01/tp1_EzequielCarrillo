package ar.edu.unju.fi.ejercicio15.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanoArray;
        do {
            System.out.println("Ingrese un número entero en el rango [5,10]:");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        String[] array = new String[tamanoArray];

        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Ingrese un nombre de persona para la posición " + i + ":");
            array[i] = scanner.next();
        }

        System.out.println("Contenido del array (de izquierda a derecha):");
        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

        System.out.println("Contenido del array (de derecha a izquierda):");
        for (int i = tamanoArray - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + array[i]);
        }

        scanner.close();
    }
}