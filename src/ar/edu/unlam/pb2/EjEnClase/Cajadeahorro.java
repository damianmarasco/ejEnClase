package ar.edu.unlam.pb2.EjEnClase;

public class Cajadeahorro extends Cuenta {

	public Cajadeahorro(String titular, String numeroDeCuenta, Double cantidad) {
		super(titular, numeroDeCuenta, cantidad);
		// TODO Auto-generated constructor stub
	}

	public void depositar() {
		if(cantidad > 0) {
			this.saldo = saldo + cantidad;
		}
	}

	@Override
	public void extraer() {
	
		
		int cantidadDeintentos = 0;
		
		if (cantidad > 0  && saldo >= cantidad && cantidadDeintentos <= 5) {
			this.saldo = saldo - cantidad;
			cantidadDeintentos++;
		}
		
		if (cantidad > 0 && saldo >= cantidad +6 && cantidadDeintentos > 5) {
			this.saldo = saldo - (cantidad + 6);
			cantidadDeintentos++;
			
		}
		}
	}
		
		
	
	
	
	
		

