package final2019Julio;

public class Avion {

	private String modelo;
	private String fechaVuelo;
	private String ciudadDestino;
	private int cantidadPasajeros;
	// private int numFil;
	// private int numCol;

	private Persona tripulantes[];

	private Persona pasajeros[][];

	public Avion(String modelo, String fechaVuelo, String ciudadDestino, int cantidadMaximaDeTripulantes,
			int cantidadDeFilas, int cantidadDeColumnas) {

		this.modelo = modelo;
		this.fechaVuelo = fechaVuelo;
		this.ciudadDestino = ciudadDestino;
		this.tripulantes = new Persona[cantidadMaximaDeTripulantes];
		this.pasajeros = new Persona[cantidadDeFilas][cantidadDeColumnas];
		this.cantidadPasajeros = 0;
		// this.numFil = cantidadDeFilas;
		// this.numCol = cantidadDeColumnas;
		/*
		 * En el constructor de la clase se deben ejecutar las instrucciones necesarias
		 * para el correcto funcionamiento de la misma.
		 */
	}

	public boolean registrarTripulante(Persona tripulante) {
		boolean registrado = false;

		if ((this.tripulantes.length > this.cantidadPasajeros) && (tripulante.getProfesion().equals("azafata")
				|| tripulante.getProfesion().equals("piloto") || tripulante.getProfesion().equals("copiloto"))) {
			this.tripulantes[cantidadPasajeros] = tripulante;
			registrado = true;
			cantidadPasajeros++;
		}
		return registrado;

		/*
		 * Sólo se pude registrar un tripulante si: a. La cantidad de tripulantes
		 * registrados es menor a la cantidad máxima de tripulantes para éste avión b.
		 * La profesión de la persona es "Asafata" o "Piloto" o "Copiloto".
		 */
	}

	public boolean sentarPasajero(Persona pasajero, int fila, int columna) {
		boolean sentado = false;

		if (this.pasajeros[fila][columna] == null) {
			this.pasajeros[fila][columna] = pasajero;
			sentado = true;
		}

		return sentado;
		/*
		 * Sólo se podrá sentar un pasajero si el asiento indicado está vacío
		 * 
		 */
	}

	public Persona buscarPasajero(int dni) {
		Persona p = null;
		boolean encontrado = false;

		for (int i = 0; i < (this.pasajeros.length); i++) {
			for (int j = 0; j < (this.pasajeros.length); j++) {
				if (this.pasajeros[i][j] != null) {
					if (this.pasajeros[i][j].getDni() == dni) {
						p = this.pasajeros[i][j];
					}
				}
			}
		}
		return p; /*
					 * Debe devolver el pasajero que tiene el DNI
					 */
	}

	public Persona buscarPasajero(String apellido, String nombre) {
		Persona p = null;

		for (int i = 0; i < this.pasajeros.length; i++) {
			for (int j = 0; j < pasajeros.length; j++) {
				if (this.pasajeros[i][j] != null) {
					if ((this.pasajeros[i][j].getApellido().equals(apellido))
							&& (this.pasajeros[i][j].getNombre().equals(nombre))) {
						p = this.pasajeros[i][j];
					}
				}
			}
		}
		return p;

		/*
		 * Debe devolver el pasajero que tiene ese apellido y nombre
		 */
	}

	public void ordenarTripulantesPorDni() {
		Persona aux;

		for (int i = 0; i < this.tripulantes.length-1; i++) {
			for (int j = 0; j < (this.tripulantes.length - 1); j++) {
				if (this.tripulantes[j].getDni() > this.tripulantes[j + 1].getDni()) {
					aux = tripulantes[j];
					tripulantes[j] = tripulantes[j + 1];
					tripulantes[j + 1] = aux;
				}
			}
		}

		/*
		 * Ordena el array de tripulantes por dni
		 */

	}

	public void ordenarTripulantesPorApellido() {
		Persona aux;

		for (int i = 0; i < this.tripulantes.length-1; i++) {
			for (int j = 0; j < (this.tripulantes.length - 1); j++) {
				if (this.tripulantes[j].getApellido().compareTo(this.tripulantes[j + 1].getApellido()) > 0) {
					aux = tripulantes[j];
					tripulantes[j] = tripulantes[j + 1];
					tripulantes[j + 1] = aux;
				}
			}
		}

		/*
		 * Ordena el array de tripulantes por apellido
		 */
	}

	/*
	 * public String toString() { String estado;
	 * 
	 * for (int i = 0; i < pasajeros.length; i++) { for (int j = 0; j <
	 * pasajeros.length; j++) { if (pasajeros[i][j] != null) { estado = "ocupado";
	 * System.out.println(estado); } else { estado = "libre";
	 * System.out.println(estado); } } }
	 * 
	 * /* Debe devolver un String que grafique los asientos qué asientos se
	 * encuentran ocupados y cuales libres
	 */

	public Persona[] ObtenerListaTripulantes() {
		return this.tripulantes;
	}

	public Persona[][] ObtenerListaPasajeros() {
		return this.pasajeros;
	}

	public int getCantidadPasajeros() {
		return this.cantidadPasajeros;
	}

}
