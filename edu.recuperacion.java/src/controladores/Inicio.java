package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static final String rutaRaizLogs = "C:\\Users\\csi23-linflez\\eclipse-workspace-recuperacion-java\\logs\\".concat(utilidades.Util.crearNombreFichero());
    public static List<AlumnoDto> listaAlumno = new ArrayList<AlumnoDto>();
	public static final String rutaAlumno = "C:\\Users\\csi23-linflez\\eclipse-workspace-recuperacion-java\\logAlumno\\".concat("ficheroAlumno.txt");
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcionSeleccion;
		boolean cerrarMenu = false;
		
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		do {
			try {
				
			opcionSeleccion = mi.menuInicial(sc);
			
			switch(opcionSeleccion) {
			case 0:
				System.out.println("Se ha cerrado  el menú.");
				cerrarMenu = true;
				fi.ficheroLog("Cerrar menú");
				break;
				
			case 1:
				System.out.println("Dar de alta a un alumno.");
				fi.ficheroLog("Dar de alta a un alumno");
				oi.aniadirAlumno();
				break;
			case 2:
				System.out.println("Mostrar fichero alumno.");
				fi.ficheroAlumno();
			
				break;
			default:
				System.out.println("La opción introducida no existe escoja otra.");
				break;
			}
			
			}catch(Exception e) {
				
				fi.ficheroLog("Error");
				
			}
				
		}while(!cerrarMenu);
		
	}
}
