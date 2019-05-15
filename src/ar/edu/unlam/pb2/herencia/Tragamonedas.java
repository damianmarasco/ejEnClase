package ar.edu.unlam.pb2.herencia;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Integer caras = 6;
	
	public Tragamonedas() {
		this.tambor1 = new Tambor((int) Math.random()*this.caras);
		this.tambor2 = new Tambor((int)Math.random()*this.caras);
	}
	
	public void girarTambor() {
		this.tambor1.setValor((int) Math.random()*this.caras);
		this.tambor2.setValor((int) Math.random()*this.caras);
	}
	
	public Boolean daPremio() {
		return (this.tambor1.getValor()==this.tambor2.getValor());
	}
}
