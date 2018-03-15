package Ejercicio;

import org.junit.Assert;
import org.junit.Test;

public class TestEjercicio {

	@Test
	public void crearEmpleadoTest1() {
		PersonaFiscal per = new PersonaFiscal("Fran", 31, 1200);
		per.vincularTipoImpuesto("B");
		Assert.assertEquals(false, per.calcularImpuesto());
	}

}
