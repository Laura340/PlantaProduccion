package Empleados;
import java.util.ArrayList;

public abstract class Operativo extends Empleado {
	Operativo(int Cedula, String Nombre, String Direccion, String Celular, String Correo, int Salario, String Fecha_ingreso,
			String Fecha_cumple) 
	{
		super(Cedula, Nombre, Direccion, Celular, Correo, Salario, Fecha_ingreso, Fecha_cumple);
	}
	
	ArrayList<String> cursos = new ArrayList<String>();
	String ubicacion_trabajo;
	String oficio;
	String descripcion;
	
	void AgregarCurso(String nombre_curso) {
		cursos.add(nombre_curso);
	}
	
	void ConsultarCursos() {
		System.out.println("Listado de cursos: ");
		
		for (String nombre_curso : cursos) 
			System.out.println(nombre_curso);
	}
	
	void ActualizarUbicacionZonaTrabajo(String zona_trabajo) {
		ubicacion_trabajo = zona_trabajo;
	}
	
	void ConsultarZonaTrabajo() {
		System.out.print("Zona de trabajo: ");
		System.out.println(ubicacion_trabajo);
	}
	
	void ActualizarOficio(String nombre_oficio, String descripcion_oficio) {
		oficio = nombre_oficio;
		descripcion = descripcion_oficio;
	}
	
	void ConsultarOficio() {
		System.out.print("Oficio: ");
		System.out.println(oficio);
		System.out.print("Descripcion labores: ");
		System.out.println(descripcion);
	}
}
