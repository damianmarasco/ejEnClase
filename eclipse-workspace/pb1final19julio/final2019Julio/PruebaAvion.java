package final2019Julio;

import java.util.Scanner;

public class PruebaAvion {


	private static  Scanner teclado = new Scanner(System.in);
	

	public static void main(String[] args) {

		int opcionIngresada;
	
		 Avion elQuevuela = new Avion("Boeing 747", "25/10/2019", "Jujuy", 5, 40, 50);
		
		
		System.out.println("Bienvenido al sistema de reserva de vuelos");
		
		do {
		System.out.println("Opción 1: Agregar tripulantes");
		System.out.println("Opción 2: Sentar pasajero");
		System.out.println("Opción 3: Buscar pasajero por DNI");
		System.out.println("Opción 4: Visualizar lista de Tripuantes");
		System.out.println("Opción 5: Visualizar lista de Pasajeros");
		System.out.println("Opción 0: Salir");
		opcionIngresada = teclado.nextInt();
		
		
		switch(opcionIngresada) {
		case 1:

			System.out.println("Ingrese el nombre");
			String nombre = teclado.next();
			System.out.println("Ingrese el apellido");
			String apellido = teclado.next();
			System.out.println("Ingrese el dni:");
			int dni = teclado.nextInt();
			System.out.println("Ingresar profesion");
			String profesion = teclado.next();	

			
			if () {
				System.out.println("Se agrego correctamente");
				else 
				System.out.println("No se puede agregar el tripulante");
					
			}
			
			break;
		case 2:
			System.out.println("Ingrese el nombre");
			String nombre = teclado.next();
			System.out.println("Ingrese el apellido");
			String apellido = teclado.next();
			System.out.println("Ingrese el dni:");
			int dni = teclado.nextInt();

			break;
		case 3:
			
			
			System.out.println(" la persona con dni "+  + "es "+ );
			
			
			break;
		case 4:
			System.out.println(" Los trupulantes son " );
				
			
		
			break;
		case 5:
			System.out.println("Los Pasajeros sentados Son " );
			

					
			System.out.println("el pasajaro en fila " +  + "columna " +  + );
//Ejemplo "el pasajaro en fila 3 columna 2 es Juan perez 302222222 pasajero"
			
			break;
		default:
			
			
			
			break;
		}
		
		}while( true);
	}
	
		
	
	
}



