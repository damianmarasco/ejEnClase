package ar.edu.unlam.pb2.herencia;

public class Profesor extends Persona {
	private String materia;

	public Profesor(String nombre, String direccion, String materia) {
		super(nombre, direccion);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
}
