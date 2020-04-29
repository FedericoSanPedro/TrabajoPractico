package app;

public class Arquitecto extends Empleado{
	private int edad;

	public Arquitecto(String nombre, String dni, int telefono, int edad) {
		super(nombre, dni, telefono);
		setEdad(edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void crearPlano() {
		System.out.println("Creando plano");
	}
}
