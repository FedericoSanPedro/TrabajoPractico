package app;

public class MaestroMayorDeObra extends Empleado implements IConstruir{
	private int numDeMatricula;
	

	public MaestroMayorDeObra(String nombre, String dni, int telefono, int numDeMatricula) {
		super(nombre, dni, telefono);
		setNumDeMatricula(numDeMatricula);
	}

	public int getNumDeMatricula() {
		return numDeMatricula;
	}

	public void setNumDeMatricula(int numDeMatricula) {
		this.numDeMatricula = numDeMatricula;
	}

	@Override
	public void construir() {
		System.out.println("El master construye");
		
	}
	
	
	
}
