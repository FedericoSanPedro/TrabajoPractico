package app;

import java.util.ArrayList;

public abstract class Obra {
	protected String direccion;
	protected int cantidadMetrosCuadrado,costoMetrosCuadrado,tiempoEstimado;
	protected ArrayList <Empleado> empleados;
	
	public Obra(String direccion, int cantidadMetrosCuadrado, int costoMetrosCuadrado, int tiempoEstimado, ArrayList<Empleado> empleados) {
		setDireccion(direccion);
		setCantidadMetrosCuadrado(cantidadMetrosCuadrado);
		setCostoMetrosCuadrado(costoMetrosCuadrado);
		setTiempoEstimado(tiempoEstimado);
		setEmpleados(empleados);
	}
	
	@Override
	public String toString() {
		return "Obra [direccion=" + direccion + ", cantidadMetrosCuadrado=" + cantidadMetrosCuadrado + ", costoMetrosCuadrado=" + costoMetrosCuadrado + ", tiempoEstimado=" + tiempoEstimado + ", empleados=" + empleados + "]";
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

	public void mostrarEmpleadosXObra() {
		if(getEmpleados() != null) {
			for(Empleado e : getEmpleados()) {
				System.out.println(e.toString());
			}
		}
	}
	
	public void mensajePlus() {
		System.out.println(toString() + " Y su costo total es de $" + calcularCosto());
	}
	
	public float costoPorDiaTotal() {
		float total =0;
		
		if(getEmpleados()!=null) {
			for(Empleado e : getEmpleados()) {
				total = total + e.getCostoPorDia();
			}
		}
		return total;
	}
	
	public float calcularCosto() {
		return (costoMetrosCuadrado * cantidadMetrosCuadrado)+((costoPorDiaTotal()) * tiempoEstimado);
	}
	
}
