package app;

public class MaestroMayorDeObra extends Empleado implements IConstruir{
	private int numDeMatricula;
	

	public MaestroMayorDeObra(String nombre, int dni, int telefono, int numDeMatricula) {
		super(nombre, dni, telefono,1800);
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
		return "MaestroMayorDeObra [numDeMatricula=" + numDeMatricula + ", nombre=" + nombre + ", telefono=" + telefono + ", costoPorDia=" + costoPorDia + ", dni=" + dni + "]";
	}

	@Override
	public void construir() {
		System.out.println("El master construye");
		
	}
	
	
	
}
