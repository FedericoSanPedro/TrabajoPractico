package app;

import java.util.ArrayList;

public class Domestica extends Obra{
	private int cantidadHabitacion;

	
	
	public Domestica(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, int cantidadHabitacion) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados);
		setCantidadHabitacion(cantidadHabitacion);
	}

	public int getCantidadHabitacion() {
		return cantidadHabitacion;
	}

	public void setCantidadHabitacion(int cantidadHabitacion) {
		this.cantidadHabitacion = cantidadHabitacion;
	}

	@Override
	public int calcularCosto() {
		return 0;
	}
	
	
}
