package Empleados;

import java.util.ArrayList;

public class Administrativo extends Empleado {
	public Administrativo(int Cedula, String Nombre, String Direccion, String Celular, String Correo, int Salario, String Fecha_ingreso,
			String Fecha_cumple) 
	{
		super(Cedula, Nombre, Direccion, Celular, Correo, Salario, Fecha_ingreso, Fecha_cumple);
	}

	ArrayList<String> titulos = new ArrayList<String>();
	int personal;
	int experiencia;
	int extension;
	
	public void AgregarTitulo(String nombre_titulo) {
		titulos.add(nombre_titulo);
	}
	
	public void ConsultarTitulos() {
		System.out.println("Listado de titulos profesionales: ");
		
		for (String nombre_titulo : titulos) 
			System.out.println(nombre_titulo);
	}
	
	public void ActualizarPersonal(int cantida_personal) {
		personal = cantida_personal;
	}
	
	public void ConsultarPersonal() {
		System.out.print("Numero de personas a cargo: ");
		System.out.println(personal);
	}
	
	public void ActualizarExperiencia(int tiempo_experiencia) {
		experiencia = tiempo_experiencia;
	}
	
	public void ConsultarExperiencia() {
		System.out.print("Años de experiencia: ");
		System.out.println(experiencia);
	}
	
	public void ActualizarExtension(int numero_ext) {
		extension = numero_ext;
	}
	
	public void ConsultarExtension() {
		System.out.print("Numero de extension: ");
		System.out.println(extension);
	}
	
	public void GenerarInforme() {
		System.out.print("Informe de planta: ");
		ConsultarPersonal();
	}
	
}
