package app;

public class Obrero extends Empleado implements IConstruir{
private int edad;
	

	public Obrero(String nombre, String dni, int telefono, int edad) {
		super(nombre, dni, telefono);
		setEdad(edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void construir() {
		System.out.println("Obrero construyendo");
		
	}
}
