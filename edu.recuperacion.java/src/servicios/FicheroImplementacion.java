package servicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import controladores.Inicio;
import dtos.AlumnoDto;

public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void ficheroLog(String mensaje) {
		try {
			FileWriter error = new FileWriter(Inicio.rutaRaizLogs, true);
			error.write(mensaje + "\n");
			error.close();

		} catch (Exception ex) {

			System.out.println("error-001" + ex);
		}
	}

	public void ficheroAlumno() {
		try {
			FileWriter error = new FileWriter(Inicio.rutaAlumno, true);
			for (AlumnoDto buscar : Inicio.listaAlumno) {
				error.write(buscar.ToString(';'));
			}
			error.close();

		} catch (Exception ex) {

			System.out.println("error-001" + ex);
		}

	}

	public void leerFicheroAlumno() {

		try {
			
			FileReader lector = new FileReader(Inicio.rutaAlumno);
			BufferedReader bf = new BufferedReader(lector);
			
			
			
			
		}catch(Exception ex){
			
			System.out.println("error-001" + ex);
		}
		
		
		
	}
}
