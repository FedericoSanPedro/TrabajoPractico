package app;

import java.util.ArrayList;

public abstract class Comercial extends Obra{
	
	private String nombre;

	public Comercial(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, String nombre) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados);
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public abstract int calcularCosto();
	
	
}
