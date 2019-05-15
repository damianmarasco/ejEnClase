package ar.edu.unlam.pb2.herencia;

public class Bicicleta {

	protected Integer plato;
	protected Integer pinion;
	protected Integer velocidad;
	
	public Bicicleta() {
		
	}
	public void setPlato(Integer plato) {
		this.plato = plato;
	}
	
	
	public void setPinion(Integer pinion) {
		this.pinion = pinion;
	}
	public void aumentarVelocidad() {
		
	}
	public void aplicarFreno(Integer decrementar) {
		this.velocidad = decrementar;
	}
	
	
}
