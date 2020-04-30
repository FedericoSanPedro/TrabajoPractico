package app;

import java.util.ArrayList;

public abstract class Comercial extends Obra{
	
	protected String nombre;

	public Comercial(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, String nombre) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados);
		setNombre(nombre);
	}

	
	
	



	@Override
	public String toString() {
		return "Comercial [nombre=" + nombre + ", direccion=" + direccion + ", cantidadMetrosCuadrado=" + cantidadMetrosCuadrado + ", costoMetrosCuadrado=" + costoMetrosCuadrado + ", tiempoEstimado=" + tiempoEstimado + ", empleados=" + empleados + "]";
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
