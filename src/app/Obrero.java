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
		return "El nombre del Obrero es " + nombre + ", su DNI: " + dni + ", su edad es " + edad + " años, su telefono " + telefono + ", y cobra por dia $" + costoPorDia + ".";
	}

	@Override
	public void construir() {
		System.out.println("Soy obrero y construyo");
		
	}
}
