package ar.edu.unlam.pb2.herencia;

public class Estudiante extends Persona {
	private String colegio;
	private Integer anio;
	
	public Estudiante(String nombre, String direccion, String colegio, Integer anio) {
		super(nombre, direccion);
		this.colegio = colegio;
		this.anio = anio;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

}
