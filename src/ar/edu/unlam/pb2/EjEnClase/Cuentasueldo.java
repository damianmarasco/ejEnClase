package ar.edu.unlam.pb2.EjEnClase;

public class Cuentasueldo extends Cuenta{

	public Cuentasueldo(String titular, String numeroDeCuenta, Double cantidad) {
		super(titular, numeroDeCuenta, cantidad);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void depositar() {
		if ( cantidad > saldo) {
			this.saldo = saldo + cantidad;
			
		}
	}
	@Override
	public void extraer () {
		if (cantidad >= 0) {
			this.saldo = saldo - cantidad;
			
		}
	}

}
