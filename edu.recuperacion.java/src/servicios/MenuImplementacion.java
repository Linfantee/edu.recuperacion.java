package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	
	public int menuInicial(Scanner sc) {
		
		int opcion;
		
		System.out.println("Menú Inicial");
		System.out.println("0. Cerrar Menú.");
		System.out.println("1. Dar de alta.");
		System.out.println("2. Mostrar fichero alumno.");
		System.out.println("");
		opcion = sc.nextInt();
		
		return opcion;
		
		
		
		
	}
	

}
