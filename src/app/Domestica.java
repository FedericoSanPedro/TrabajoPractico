package app;

import java.util.ArrayList;
import Empleado.java;

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
	public int calcularCosto() {
		return 0;//(costoMetrosCuadrado * cantidadMetrosCuadrado)+(costoPorDia * tiempoEstimado);
	}
	
	
}
