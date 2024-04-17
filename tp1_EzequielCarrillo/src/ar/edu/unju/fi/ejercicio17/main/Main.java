package ar.edu.unju.fi.ejercicio17.main;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        altaJugador(jugadores, scanner);
                        break;
                    case 2:
                        mostrarDatosJugador(jugadores, scanner);
                        break;
                    case 3:
                        mostrarJugadoresOrdenados(jugadores);
                        break;
                    case 4:
                        modificarJugador(jugadores, scanner);
                        break;
                    case 5:
                        eliminarJugador(jugadores, scanner);
                        break;
                    case 6:
                        mostrarCantidadTotalJugadores(jugadores);
                        break;
                    case 7:
                        mostrarCantidadJugadoresNacionalidad(jugadores, scanner);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 8.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero.");
                scanner.next();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de opciones:");
        System.out.println("1 – Alta de jugador");
        System.out.println("2 – Mostrar los datos del jugador");
        System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
        System.out.println("4 – Modificar los datos de un jugador");
        System.out.println("5 – Eliminar un jugador");
        System.out.println("6 – Mostrar la cantidad total de jugadores");
        System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
        System.out.println("8 – Salir");
        System.out.println("Ingrese su opción:");
    }

    private static void altaJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        try {
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
            String fechaNacimientoStr = scanner.nextLine();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

            System.out.println("Ingrese la nacionalidad:");
            String nacionalidad = scanner.nextLine();

            System.out.println("Ingrese la estatura:");
            double estatura = scanner.nextDouble();

            System.out.println("Ingrese el peso:");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            String posicion;
            do {
                System.out.println("Ingrese la posición (delantero, medio, defensa, arquero):");
                posicion = scanner.nextLine();

                if (posicion.equals("delantero") || posicion.equals("medio") || posicion.equals("defensa") || posicion.equals("arquero")) {
                    break;
                } else {
                    System.out.println("La posición ingresada no es válida. Por favor, ingrese una posición válida.");
                }
            } while (true);


            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);

            System.out.println("Jugador agregado correctamente.");
        } catch (DateTimeParseException e) {
            System.out.println("Error: Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato YYYY-MM-DD.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un número decimal para la estatura y el peso.");
            scanner.next(); 
        }
    }

    private static void mostrarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println(jugador);
                return;
            }
        }

        System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
    }

    private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        ArrayList<Jugador> copiaJugadores = new ArrayList<>(jugadores);
        Collections.sort(copiaJugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));

        System.out.println("Jugadores ordenados por apellido:");
        for (Jugador jugador : copiaJugadores) {
            System.out.println(jugador);
        }
    }

    private static void modificarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Ingrese el nuevo nombre:");
                jugador.setNombre(scanner.nextLine());

                System.out.println("Ingrese el nuevo apellido:");
                jugador.setApellido(scanner.nextLine());

                System.out.println("Datos del jugador modificados correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
    }

    private static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresNacionalidad(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.println("Ingrese la nacionalidad:");
        String nacionalidad = scanner.nextLine();

        int cantidad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                cantidad++;
            }
        }

        System.out.println("Cantidad de jugadores de la nacionalidad " + nacionalidad + ": " + cantidad);
    }
}