package Ejercicio;

public class PersonaFiscal {
	private String nombre;
	private int edad;
	private int sueldo;
	TipoImpuesto tipo;

	public PersonaFiscal(String _nombre, int _edad, int _sueldo) {
		this.nombre = _nombre;
		this.edad = _edad;
		this.sueldo = _sueldo;
	}

	public int calcularImpuesto() {
		int impuesto = 0;
		if (this.edad < 30) {
			this.tipo.getPorcentaje30();

		} else if (this.edad >= 30) {
			this.tipo.getPorcentaje();
		}
		return impuesto;
	}

	public void vincularTipoImpuesto(String _tipo) {
		if (_tipo.equals("A")) {
			this.tipo = new TipoImpuesto(20, 30, "A");
		} else if (_tipo.equals("B")) {
			this.tipo = new TipoImpuesto(10, 5, "B");
		} else if (_tipo.equals("C")) {
			this.tipo = new TipoImpuesto(30, 25, "C");
		} else if (_tipo.equals("D")) {
			this.tipo = new TipoImpuesto(10, 30, "D");
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
