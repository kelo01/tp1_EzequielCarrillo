package ar.edu.unju.fi.ejercicio12.main;
import java.util.*;
import ar.edu.unju.fi.ejercicio12.model.Persona;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el nombre de la persona:");
	        String nombre = scanner.nextLine();

	        System.out.println("Ingrese la fecha de nacimiento (formato: dd/mm/yyyy):");
	        String fechaNacimientoStr = scanner.nextLine();
	        String[] fechaPartes = fechaNacimientoStr.split("/");
	        int dia = Integer.parseInt(fechaPartes[0]);
	        int mes = Integer.parseInt(fechaPartes[1]) - 1; 
	        int anio = Integer.parseInt(fechaPartes[2]);

	        Calendar fechaNacimiento = Calendar.getInstance();
	        fechaNacimiento.set(anio, mes, dia);

	        Persona persona = new Persona(nombre, fechaNacimiento);

	        System.out.println("Nombre: " + persona.getNombre());
	        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio);
	        System.out.println("Edad: " + persona.calcularEdad() + " años");
	        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
	        System.out.println("Estación: " + persona.obtenerEstacion());

	        scanner.close();
	}	

}