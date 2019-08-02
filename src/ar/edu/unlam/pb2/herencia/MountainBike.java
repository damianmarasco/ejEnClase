package ar.edu.unlam.pb2.herencia;

public class MountainBike extends Bicicleta{

	private Integer alturaAsiento;
	
	public MountainBike() {
	}

	public void setAlturaAsiento(Integer alturaAsiento) {
		this.alturaAsiento = alturaAsiento;
	}
	
	@Override
	public void setPinion (Integer pinion) {
		this.pinion = pinion;
		this.velocidad = 1;
	}
	

}
