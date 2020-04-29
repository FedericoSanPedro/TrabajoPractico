package app;

import java.util.ArrayList;

public class Comercio extends Comercial{
	
	private String rubro;

	public Comercio(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados, String nombre, String rubro) {
		super(direccion, cantidadMetrosCuadrado, costoMetrosCuadrado, tiempoEstimado, empleados, nombre);
		setRubro(rubro);
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	
	@Override
	public int calcularCosto() {
		return 0;
	}
	
}
