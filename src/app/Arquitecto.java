package app;

public class Arquitecto extends Empleado{
	private int edad;

	public Arquitecto(String nombre, int dni, int telefono, int edad) {
		super(nombre, dni, telefono, 2000);
		setEdad(edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Arquitecto [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + ", costoPorDia=" + costoPorDia + ", dni=" + dni + "]";
	}
	

	public void crearPlano() {
		System.out.println("Creando plano");
	}
}
