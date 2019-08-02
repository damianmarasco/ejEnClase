package ar.edu.unlam.pb2.EjEnClase;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.herencia.Tragamonedas;

public class TragamonedasTest {
	@Test
	public void probarTragamoneda() {
		Tragamonedas tragamoneda = new Tragamonedas();
		
		tragamoneda.girarTambor();
		Assert.assertTrue(tragamoneda.daPremio());
	}
}
