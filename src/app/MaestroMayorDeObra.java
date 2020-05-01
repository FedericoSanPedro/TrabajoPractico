package app;

public class MaestroMayorDeObra extends Empleado implements IConstruir{
	private int edad;
	

	public MaestroMayorDeObra(String nombre, int dni, int telefono, int edad) {
		super(nombre, dni, telefono,1800);
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
		return "El nombre del Maestro Mayor de Obras es " + nombre + ", su DNI: " + dni + ", su edad es " + edad + " años, su telefono " + telefono + ", y cobra por dia $" + costoPorDia + ".";
	}

	@Override
	public void construir() {
		System.out.println("“Soy maestro y superviso las construcciones");
		
	}
	
	
	
}
