package app;

public class Obrero extends Empleado implements IConstruir{
private int edad;
	

	public Obrero(String nombre, int dni, int telefono, int edad) {
		super(nombre, dni, telefono,1500);
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
		return "Obrero [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + ", costoPorDia=" + costoPorDia + ", dni=" + dni + "]";
	}

	@Override
	public void construir() {
		System.out.println("Obrero construyendo");
		
	}
}
