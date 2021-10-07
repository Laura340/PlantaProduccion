package Empleados;

public abstract class Empleado {

	Empleado(int Cedula, String Nombre, String Direccion, String Celular, String Correo, int Salario, String Fecha_ingreso,
			String Fecha_cumple) 
	{
		cedula = Cedula;
		nombre = Nombre;
		direccion = Direccion;
		celular = Celular;
		correo = Correo;
		salario = Salario;
		fecha_ingreso = Fecha_ingreso;
		fecha_cumple = Fecha_cumple;
	}

	int cedula;
	String nombre;
	String direccion;
	String celular;
	String correo;
	int salario;
	String fecha_ingreso;
	String fecha_cumple;

	public void ActualizarDireccion(String new_direccion) {
		direccion = new_direccion;
	}

	public void ActualizarCelular(String new_celular) {
		celular = new_celular;
	}

	public void ActualizarCorreo(String new_correo) {
		correo = new_correo;
	}

	public int ConsultarLiquidacionNomina(int dias) {
		return salario;
	}

	public int ConsultarLiquidacionVacaciones(int dias) {
		return salario;
	}

}
