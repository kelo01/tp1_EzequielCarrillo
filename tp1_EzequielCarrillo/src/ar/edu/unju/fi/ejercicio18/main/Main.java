package ar.edu.unju.fi.ejercicio18.main;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        paises.add(new Pais("ES", "España"));
        paises.add(new Pais("FR", "Francia"));

        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos de un país");
            System.out.println("9 - Salir");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico(destinos, paises, scanner);
                        break;
                    case 2:
                        mostrarDestinos(destinos);
                        break;
                    case 3:
                        modificarPaisDestino(destinos, paises, scanner);
                        break;
                    case 4:
                        destinos.clear();
                        System.out.println("Lista de destinos turísticos limpiada.");
                        break;
                    case 5:
                        eliminarDestino(destinos, scanner);
                        break;
                    case 6:
                        mostrarDestinosOrdenados(destinos);
                        break;
                    case 7:
                        mostrarPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(destinos, scanner);
                        break;
                    case 9:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número válido.");
                scanner.next();
                opcion = 0;
            }
        } while (opcion != 9);
    }

    public static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
        System.out.println("Ingrese el código del destino turístico:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del destino turístico:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio:");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el código del país:");
        String codigoPais = scanner.next();
        Pais pais = Pais.buscarPaisPorCodigo(paises, codigoPais);
        if (pais != null) {
            System.out.println("Ingrese la cantidad de días:");
            int cantidadDias = scanner.nextInt();
            DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
            destinos.add(destino);
            System.out.println("Destino turístico agregado correctamente.");
        } else {
            System.out.println("El código de país ingresado no es válido.");
        }
    }

    public static void mostrarDestinos(ArrayList<DestinoTuristico> destinos) {
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    public static void modificarPaisDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
        System.out.println("Ingrese el código del destino turístico que desea modificar:");
        String codigoDestino = scanner.next();
        boolean encontrado = false;
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo().equals(codigoDestino)) {
                System.out.println("Ingrese el nuevo código de país:");
                String nuevoCodigoPais = scanner.next();
                Pais nuevoPais = Pais.buscarPaisPorCodigo(paises, nuevoCodigoPais);
                if (nuevoPais != null) {
                    destino.setPais(nuevoPais);
                    System.out.println("País modificado correctamente.");
                } else {
                    System.out.println("El código de país ingresado no es válido.");
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El destino turístico con el código especificado no fue encontrado.");
        }
    }

    public static void eliminarDestino(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
        System.out.println("Ingrese el código del destino turístico que desea eliminar:");
        String codigoDestino = scanner.next();
        boolean encontrado = false;
        for (int i = 0; i < destinos.size(); i++) {
            DestinoTuristico destino = destinos.get(i);
            if (destino.getCodigo().equals(codigoDestino)) {
                destinos.remove(i);
                System.out.println("Destino turístico eliminado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El destino turístico con el código especificado no fue encontrado.");
        }
    }

    public static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
        Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
        mostrarDestinos(destinos);
    }

    public static void mostrarPaises(ArrayList<Pais> paises) {
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    public static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
        System.out.println("Ingrese el código del país:");
        String codigoPais = scanner.next();
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo().equals(codigoPais)) {
                System.out.println(destino);
            }
        }
    }
}