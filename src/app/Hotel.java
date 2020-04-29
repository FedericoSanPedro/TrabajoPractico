package app;

import java.util.ArrayList;

public class Hotel extends Comercial{

	private int cantidadDePiso;
	
	public Hotel(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, String nombre, int cantidadDePiso) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados, nombre);
		setCantidadDePiso(cantidadDePiso);
	}

	public int getCantidadDePiso() {
		return cantidadDePiso;
	}

	public void setCantidadDePiso(int cantidadDePiso) {
		this.cantidadDePiso = cantidadDePiso;
	}
	
	@Override
	public int calcularCosto() {
		return 0;
	}
	
}
