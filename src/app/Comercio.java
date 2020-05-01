package app;

import java.util.ArrayList;

public class Comercio extends Comercial{
	
	private String rubro;

	public Comercio(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, String nombre, String rubro) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados, nombre);
		setRubro(rubro);
	}
	
	public String toString() {
		return "El comercio " + nombre + " se situa en " + direccion + ", tiene " + rubro + " como rubros, con una cantidad total de " + cantidadMetrosCuadrado + " mt2 y su costo por cada uno es de $" + costoMetrosCuadrado + ". Se estimula que los empleados tardaran unos " + tiempoEstimado + " dias en terminar la construccion.";
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	

	public void mostrarEmpleadosXObra() {
		super.mostrarEmpleadosXObra();
	}
	
	
	@Override
	public float calcularCosto() {
		return super.calcularCosto();
	}
	
}
