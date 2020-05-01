package app;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList <Empleado> empleados;
	private ArrayList <Obra> obras;
	
	public Empresa(String nombre, ArrayList<Empleado> empleados, ArrayList <Obra> obras) {
		setNombre(nombre);
		this.empleados= new ArrayList<>();
		this.obras= new ArrayList<>();
	}
	

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Obra> getObras() {
		return obras;
	}

	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarEmpleadosXObra(ArrayList<Empleado> empleados) {
			for(Empleado e : empleados) {
		System.out.println(e.toString());
	}
	}
	
	/*public int calcularCosto() {
		return (costoMetrosCuadrado * cantidadMetrosCuadrado)+(costoPorDia * tiempoEstimado);
	}*/
	
}
