package ar.edu.unlam.pb2.EjEnClase;

import org.junit.Assert;
import org.junit.Test;

public class FechaTest {
	@Test
	public void testQueChequeaSiSeCreaUnaFecha() {
		Integer dia = 18;
		Integer mes = 4;
		Integer anio = 2019;
		
		Fecha fecha = new Fecha(dia, mes, anio);
	}
	
	@Test
	public void testQueComparaFechasIguales() {
		Integer dia = 18;
		Integer mes = 4;
		Integer anio = 2019;
		
		Fecha fecha = new Fecha(dia, mes, anio);
		Fecha fecha2 = new Fecha(dia, mes, anio);

		Assert.assertEquals(fecha, fecha2);
	}
}
