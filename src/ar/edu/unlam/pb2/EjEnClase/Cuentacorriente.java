package ar.edu.unlam.pb2.EjEnClase;

public class Cuentacorriente extends Cuenta {

	public Cuentacorriente(String titular, String numeroDeCuenta, Double cantidad) {
		super(titular, numeroDeCuenta, cantidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar() {
		if(cantidad > 0) {
			this.saldo = saldo + cantidad;
		}	
	}

	@Override
	public void extraer() {
		if (cantidad < saldo) {
			saldo = saldo - cantidad - (cantidad * 0.05);
		}
		
	}

}
