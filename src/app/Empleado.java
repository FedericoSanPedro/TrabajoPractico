package app;

public abstract class Empleado {
	private String nombre, dni;
	private int telefono;
	
	public Empleado(String nombre, String dni, int telefono) {
		setNombre(nombre);
		setDni(dni);
		setTelefono(telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
