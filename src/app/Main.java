package app;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Arquitecto arq1= new Arquitecto("Federico San Pedro",39170532,153047448,3);
		Arquitecto arq2= new Arquitecto("Nicolas Pafundi",38576984,154689720,2);
		
		MaestroMayorDeObra mas1 = new MaestroMayorDeObra("Franco Pomponio",37845126,148795624,24);
		MaestroMayorDeObra mas2 = new MaestroMayorDeObra("Alejandro Ramos",39170526,175986248,24);
		MaestroMayorDeObra mas3 = new MaestroMayorDeObra("Nicolas Lieby",38745169,174820459,24);
		MaestroMayorDeObra mas4 = new MaestroMayorDeObra("Nicolas Stopiello",38745691,157894269,24);
		MaestroMayorDeObra mas5 = new MaestroMayorDeObra("Damian Etchevest",35789145,157894634,24);
		
		Obrero obr1 = new Obrero("Raul Alonso",37894120,154782069,24);
		Obrero obr2 = new Obrero("Nahuel Sacco",37410589,150260480,24);
		Obrero obr3 = new Obrero("Francisco Cinalli",37841089,157268039,24);
		Obrero obr4 = new Obrero("Kevin Aliaga",35800120,156988999,24);
		Obrero obr5 = new Obrero("Dalmiro Ferrando",38456123,157222333,24);
		Obrero obr6 = new Obrero("Mariano De Simone",36897541,152487896,25);
		Obrero obr7 = new Obrero("Juan Gonzalez",38974512,157849526,24);
		
		arq1.crearPlano();
		
		mas1.construir();
		
		obr1.construir();
		
		ArrayList<Empleado> listaEmpleadosTotal = new ArrayList<>();
		
		listaEmpleadosTotal.add(arq1);
		listaEmpleadosTotal.add(arq2);
		listaEmpleadosTotal.add(mas1);
		listaEmpleadosTotal.add(mas2);
		listaEmpleadosTotal.add(mas3);
		listaEmpleadosTotal.add(mas4);
		listaEmpleadosTotal.add(mas5);
		listaEmpleadosTotal.add(mas1);
		listaEmpleadosTotal.add(obr1);
		listaEmpleadosTotal.add(obr2);
		listaEmpleadosTotal.add(obr3);
		listaEmpleadosTotal.add(obr4);
		listaEmpleadosTotal.add(obr5);
		listaEmpleadosTotal.add(obr6);
		listaEmpleadosTotal.add(obr7);
		
		ArrayList<Empleado> listaEmpleados1 = new ArrayList<>();
		
		listaEmpleados1.add(arq1);
		listaEmpleados1.add(mas2);
		listaEmpleados1.add(mas3);
		listaEmpleados1.add(mas4);
		listaEmpleados1.add(obr1);
		listaEmpleados1.add(obr3);
		listaEmpleados1.add(obr4);
		listaEmpleados1.add(obr7);
		
		ArrayList<Empleado> listaEmpleados2 = new ArrayList<>();
		
		listaEmpleados2.add(arq2);
		listaEmpleados2.add(mas1);
		listaEmpleados2.add(mas4);
		listaEmpleados2.add(obr2);
		listaEmpleados2.add(obr3);
		listaEmpleados2.add(obr5);
		
		ArrayList<Empleado> listaEmpleados3 = new ArrayList<>();
		
		listaEmpleados3.add(arq1);
		listaEmpleados3.add(mas5);
		listaEmpleados3.add(obr1);
		listaEmpleados3.add(obr2);
		listaEmpleados3.add(obr6);
		
		Domestica obra1 = new Domestica("Jose Ingerieros 1489",30,42,120,listaEmpleados3,7);
		
		System.out.println(obra1.toString());
		
		Hotel obra2 = new Hotel("Alvarado 1578",128,42,420,listaEmpleados1,"Sheraton",15);
		
		System.out.println(obra2.toString());
		
		Comercio obra3 = new Comercio("Tejedor 1574",40,42,160,listaEmpleados2,"Pepe Miglio","Pizzeria");
		
		System.out.println(obra3.toString());
		
		ArrayList <Obra> obras = new ArrayList<>();
		
		obras.add(obra1);
		obras.add(obra2);
		obras.add(obra3);
		
		Empresa emp1 = new Empresa("Santander",listaEmpleadosTotal,obras);
		
		System.out.println("El costo total de la obra es $" + obra1.calcularCosto());
		
		obra1.mostrarEmpleadosXObra();
		
	}

}
