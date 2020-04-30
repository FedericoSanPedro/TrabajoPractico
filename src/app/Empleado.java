package app;

public abstract class Empleado {
	protected String nombre;
	protected int telefono, costoPorDia, dni;
	
	public Empleado(String nombre, int dni, int telefono, int costoPorDia) {
		setNombre(nombre);
		setDni(dni);
		setTelefono(telefono);
		setCostoPorDia(costoPorDia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCostoPorDia() {
		return costoPorDia;
	}

	public void setCostoPorDia(int costoPorDia) {
		this.costoPorDia = costoPorDia;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", telefono=" + telefono + ", costoPorDia=" + costoPorDia + ", dni=" + dni + "]";
	}
	
	
	
}
