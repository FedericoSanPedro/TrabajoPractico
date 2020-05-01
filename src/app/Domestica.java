package app;

import java.util.ArrayList;

public class Domestica extends Obra{
	private int cantidadHabitacion;
	
	public Domestica(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, int cantidadHabitacion) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados);
		setCantidadHabitacion(cantidadHabitacion);
	}

	@Override
	public String toString() {
		return "Esta vivienda domestica se situa en " + direccion + ", tiene " + cantidadHabitacion + " habitaciones, con una cantidad total de " + cantidadMetrosCuadrado + " mt2 y su costo por cada uno es de $" + costoMetrosCuadrado + ". Se estimula que los empleados tardaran unos " + tiempoEstimado + " dias en terminar la construccion.";
	}

	public int getCantidadHabitacion() {
		return cantidadHabitacion;
	}

	public void setCantidadHabitacion(int cantidadHabitacion) {
		this.cantidadHabitacion = cantidadHabitacion;
	}

	@Override
	public float calcularCosto() {
		return super.calcularCosto();//(costoMetrosCuadrado * cantidadMetrosCuadrado)+(costoPorDia * tiempoEstimado);
	}
	

	public void mostrarEmpleadosXObra() {
		super.mostrarEmpleadosXObra();
	}
	
}
