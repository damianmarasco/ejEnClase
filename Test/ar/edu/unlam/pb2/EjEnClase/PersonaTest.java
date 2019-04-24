package ar.edu.unlam.pb2.EjEnClase;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {
	@Test
	public void testQueComparaLosDniIguales() {
		Integer dni = 29392118;
		String nombre = "Diego";
		String nombre2 = "Dami";
		Integer edad = 34;

		Persona persona1 = new Persona(dni, nombre, edad);
		Persona persona2 = new Persona(dni, nombre2, edad);

		Assert.assertEquals(persona1, persona2);
		Assert.assertTrue(persona1.equals(persona2));

	}

}
