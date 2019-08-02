package ar.edu.unlam.pb2.EjEnClase;

public abstract class Cuenta {
	
	protected Double saldo;
	protected String titular;
	protected Double cantidad;
	protected String numeroDeCuenta;
	
	public  Cuenta (String titular, String numeroDeCuenta, Double cantidad) {
		
		 this.saldo= 0.0;
		 this.titular= titular;
		 this.cantidad= cantidad;
		 this.numeroDeCuenta = numeroDeCuenta;
	}
	
	

	public abstract void depositar () ;
		
	
	public abstract void extraer () ;
		
		
	

}
