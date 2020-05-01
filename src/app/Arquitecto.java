package app;

public class Arquitecto extends Empleado{
	private int numDeMatricula;

	public Arquitecto(String nombre, int dni, int telefono, int numDeMatricula) {
		super(nombre, dni, telefono, 2000);
		setNumDeMatricula(numDeMatricula);
	}

	public int getNumDeMatricula() {
		return numDeMatricula;
	}

	public void setNumDeMatricula(int numDeMatricula) {
		this.numDeMatricula = numDeMatricula;
	}

	
	
	@Override
	public String toString() {
		return "El nombre del Arquitecto es " + nombre + ", su DNI: " + dni + ", su numero de matricula es " + numDeMatricula + ", su telefono " + telefono + ", y cobra por dia $" + costoPorDia + ".";
	}
	

	public void crearPlano() {
		System.out.println("Creando mi próximo plano");
	}
}
