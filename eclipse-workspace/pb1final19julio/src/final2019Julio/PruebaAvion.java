package final2019Julio;

import java.util.Scanner;

public class PruebaAvion {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcionIngresada;

		Avion elQuevuela = new Avion("Boeing 747", "25/10/2019", "Jujuy", 5, 40, 50);

		System.out.println("Bienvenido al sistema de reserva de vuelos");

		do {
			System.out.println("Opción 1: Agregar tripulantes");
			System.out.println("Opción 2: Sentar pasajero");
			System.out.println("Opción 3: Buscar pasajero por DNI");
			System.out.println("Opción 4: Visualizar lista de Tripulantes");
			System.out.println("Opción 5: Visualizar lista de Pasajeros");
			System.out.println("Opción 0: Salir");
			opcionIngresada = teclado.nextInt();

			switch (opcionIngresada) {
			case 1:

				System.out.println("Ingrese el nombre");
				String nombre = teclado.next();
				System.out.println("Ingrese el apellido");
				String apellido = teclado.next();
				System.out.println("Ingrese el dni:");
				int dni = teclado.nextInt();
				System.out.println("Ingresar profesion");
				String profesion = teclado.next();

				Persona tripulante = new Persona(nombre, apellido, dni, profesion);

				if (elQuevuela.registrarTripulante(tripulante) == true) {
					System.out.println("Se agrego correctamente");
				} else {
					System.out.println("No se puede agregar el tripulante");

				}

				break;
			case 2:
				System.out.println("Ingrese el nombre");
				String nombre1 = teclado.next();
				System.out.println("Ingrese el apellido");
				String apellido1 = teclado.next();
				System.out.println("Ingrese el dni:");
				int dni1 = teclado.nextInt();
				System.out.println("Indique la fila: ");
				int fila = teclado.nextInt();
				System.out.println("Indique la columna: ");
				int col = teclado.nextInt();
				Persona pasajero = new Persona(nombre1, apellido1, dni1, null);

				if (elQuevuela.sentarPasajero(pasajero, fila, col) == true) {
					System.out.println("pasajero sentado");
				} else {
					System.out.println("asiento ocupado");
				}

				break;
			case 3:
				System.out.println("Ingrese el dni que desea buscar: ");
				int dni2 = teclado.nextInt();

				Persona p = elQuevuela.buscarPasajero(dni2);

				System.out.println(" la persona con dni " + p.getDni() + "es " + p.getNombre() + " " + p.getApellido());

				break;
			case 4:
				System.out.println(" Los tripulantes son ");

				Persona[] tripulantes = elQuevuela.ObtenerListaTripulantes();

				for (int i = 0; i < elQuevuela.getCantidadPasajeros(); i++) {
					System.out.println(tripulantes[i].toString());
				}

				break;
			case 5:
				System.out.println("Los Pasajeros sentados Son ");

				Persona[][] pasajeros = elQuevuela.ObtenerListaPasajeros();

				for (int i = 0; i < (pasajeros.length); i++) {
					for (int j = 0; j < (pasajeros.length); j++) {
						if (pasajeros[i][j] == null) {
							System.out.print("asiento vacio");
						} else {
							System.out.print(pasajeros[i][j].getApellido() + " " + pasajeros[i][j].getNombre() + " "
									+ pasajeros[i][j].getDni()+" " + "fila: " + i + " Col: " + j);
						}
					System.out.println();
					}
				}

				// Ejemplo "el pasajaro en fila 3 columna 2 es Juan perez 302222222 pasajero"

				break;
			default:

				break;
			}

		} while (opcionIngresada != 0);
	}

}
