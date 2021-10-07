package Inicio;
import java.util.Scanner;
import Empleados.*;

public class MenuInicio {
	static int OpcionUsuario = -1;
	static Scanner scanner = new Scanner(System.in);
	
	// Creamos empleados de cada tipo
	static Administrativo administrador = new Administrativo(123, "Gabriel", "Medellin", "3001254567", 
			"jefe@admin.com", 10000000, "2005", "Mayo 15");
	
	static Tecnicos tecnico = new Tecnicos(123, "Armando", "Bogota", "3001534567", 
			"jefe@admin.com", 5000000, "2005", "Mayo 15");
			
	static NoTecnicos noTecnico = new NoTecnicos(123, "Julio", "Baranquilla", "3211253567", 
			"jefe@admin.com", 2000000, "2005", "Mayo 15");

	public static void main(String[] args) {
		while (OpcionUsuario != 0) {
			try {
				System.out.println("*   PLANTA DE PRODUCCION *\n");
				System.out.println("     .:: MENU PRINCIPAL ::.   \n");
				System.out.println("1. Operativos.                      ");
				System.out.println("2. Administrativos.              ");
				System.out.println("3. Tecnicos.                     ");
				System.out.println("4. No Tecnicos.                      ");
				System.out.println("0. Salir                      \n");
				System.out.print("Señor usuario, elige opción: ");
				OpcionUsuario = Integer.parseInt(scanner.nextLine());

				switch (OpcionUsuario) {
				case 1:
					// Codigo opcion #1;
					
					break;
				case 2:
					MostrarMenuAdmin();
					break;
				case 3:
					// Codigo opcion #3;
					break;
				case 4:
					// Codigo opcion #4;
					break;
				case 0:
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Opción no reconocida");
					break;
				}
				System.out.println("\n");
			} catch (Exception e) {
				System.out.println("Uoop! Error!");
			}
		}
	}
	
	static void MostrarMenuAdmin()
	{
		int OpcionAdmin = -1;
		
		System.out.println("* MENU ADMINISTRATIVO *\n");
		System.out.println("1. Agregar Personal.            ");
		System.out.println("2. Modificar Experiencia.          ");
		System.out.println("3. Modificar Extension.            ");
		System.out.println("4. Informe de Planta.           ");
		System.out.println("0. Salir                      \n");
		System.out.print("Señor usuario, elige opción: ");
		OpcionAdmin = Integer.parseInt(scanner.nextLine());
		
		switch(OpcionAdmin) {
		case 1:
			administrador.ActualizarPersonal(Integer.parseInt(scanner.nextLine()));
			break;
		case 2:
			administrador.ActualizarExperiencia(Integer.parseInt(scanner.nextLine()));
			break;
		case 3:
			administrador.ActualizarExtension(Integer.parseInt(scanner.nextLine()));
			break;
		case 4:
			administrador.GenerarInforme();
			break;
		}
	}
}
