package app;

import java.util.ArrayList;

public class Hotel extends Comercial{

	private int cantidadDePiso;
	
	public Hotel(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, String nombre, int cantidadDePiso) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados, nombre);
		setCantidadDePiso(cantidadDePiso);
	}
	
	

	public String toString() {
		return "El hotel " + nombre + " se situa en " + direccion + ", tiene " + cantidadDePiso + " pisos, con una cantidad total de " + cantidadMetrosCuadrado + " mt2 y su costo por cada uno es de $" + costoMetrosCuadrado + ". Se estimula que los empleados tardaran unos " + tiempoEstimado + " dias en terminar la construccion.";
	}
	
	public void mostrarEmpleadosXObra() {
		super.mostrarEmpleadosXObra();
	}

	public int getCantidadDePiso() {
		return cantidadDePiso;
	}

	public void setCantidadDePiso(int cantidadDePiso) {
		this.cantidadDePiso = cantidadDePiso;
	}
	
	public float calcularCosto() {
		return super.calcularCosto();
	}
	
}
