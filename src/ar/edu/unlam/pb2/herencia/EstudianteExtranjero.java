package ar.edu.unlam.pb2.herencia;

public class EstudianteExtranjero extends Estudiante{
	private String pais;

	public EstudianteExtranjero(String nombre, String direccion, String colegio, Integer anio, String pais) {
		super(nombre, direccion, colegio, anio);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
