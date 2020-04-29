package app;

import java.util.ArrayList;

public abstract class Obra {
	private String direccion;
	private int cantidadMetrosCuadrado,costoMetrosCuadrado,tiempoEstimado;
	private ArrayList <Empleado> empleados;
	
	public Obra(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados) {
		setDireccion(direccion);
		setCantidadMetrosCuadrado(cantidadMetrosCuadrado);
		setCostoMetrosCuadrado(costoMetrosCuadrado);
		setTiempoEstimado(tiempoEstimado);
		this.empleados= new ArrayList<>();
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getCantidadMetrosCuadrado() {
		return cantidadMetrosCuadrado;
	}
	
	public void setCantidadMetrosCuadrado(int cantidadMetrosCuadrado) {
		this.cantidadMetrosCuadrado = cantidadMetrosCuadrado;
	}
	
	public int getCostoMetrosCuadrado() {
		return costoMetrosCuadrado;
	}
	
	public void setCostoMetrosCuadrado(int costoMetrosCuadrado) {
		this.costoMetrosCuadrado = costoMetrosCuadrado;
	}
	
	public int getTiempoEstimado() {
		return tiempoEstimado;
	}
	
	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public abstract int calcularCosto();
	
	
}
