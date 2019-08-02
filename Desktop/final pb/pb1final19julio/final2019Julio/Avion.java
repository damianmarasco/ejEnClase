package final2019Julio;

public class Avion {

	private String modelo;
	private String fechaVuelo;
	private String ciudadDestino;

	private Persona tripulantes[];

	private Persona pasajeros[][];

	public Avion(String modelo, String fechaVuelo, String ciudadDestino, int cantidadMaximaDeTripulantes,
			int cantidadDeFilas, int cantidadDeColumnas) {

		/*
		 * En el constructor de la clase se deben ejecutar las instrucciones necesarias
		 * para el correcto funcionamiento de la misma.
		 */
	}

	public boolean registrarTripulante(Persona tripulante) {
		
		for()
		
		/*
		 * Sólo se pude registrar un tripulante si: a. La cantidad de tripulantes
		 * registrados es menor a la cantidad máxima de tripulantes para éste avión b.
		 * La profesión de la persona es "Asafata" o "Piloto" o "Copiloto".
		 */
	}

	public boolean sentarPasajero(Persona pasajero, int fila, int columna) {
		/*
		 * Sólo se podrá sentar un pasajero si el asiento indicado está vacío
		 * 
		 */
	}

	public Persona buscarPasajero(int dni) {
		/*
		 * Debe devolver el pasajero que tiene el DNI
		 */
	}

	public Persona buscarPasajero(String apellido, String nombre) {
		/*
		 * Debe devolver el pasajero que tiene ese apellido y nombre
		 */
	}

	public void ordenarTripulantesPorDni() {
		/*
		 * Ordena el array de tripulantes por dni
		 */

	}

	public void ordenarTripulantesPorApellido() {
		/*
		 * Ordena el array de tripulantes por apellido
		 */
	}

	public String toString() {
		/*
		 * Debe devolver un String que grafique los asientos qué asientos se encuentran
		 * ocupados y cuales libres
		 */
	}

	public Persona[] ObtenerListaTripulantes() {

	}

	public Persona[][] ObtenerListaPasajeros() {

	}

}
