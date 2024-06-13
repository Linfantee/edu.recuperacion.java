package servicios;

import java.util.Scanner;

import controladores.Inicio;
import dtos.AlumnoDto;

public class OperativaImplementacion implements OperativaInterfaz{
	
	Scanner sc = new Scanner(System.in);
	
	 private long idAutomatico()
	 {
		 int tamaño = Inicio.listaAlumno.size();
			long id;
			if(tamaño<=0){
				id = 1;
			}else {
				id = Inicio.listaAlumno.get(tamaño-1).getIdAlumno() + 1;
			}
			return id;


	 }
	
	
	public void aniadirAlumno() {
		
		

        boolean alumnoNuevo = true;
      
            do
            {

                AlumnoDto alumno = new AlumnoDto();

                System.out.println("Introduzca el nombre del alumno.");
                alumno.setNombre(sc.next());
                System.out.println("Introduzca el primer apellido del alumno.");
                alumno.setApellido1(sc.next());
                System.out.println("Introduzca el segundo apellido del alumno.");
                alumno.setApellido2(sc.next());
                System.out.println("Introduzca el DNI del alumno.");
                alumno.setDni(sc.next());
                System.out.println("Introduzca el teléfono del alumno.");
                alumno.setTelefono(sc.next());
                System.out.println("Introduzca el email del alumno.");
                alumno.setEmail(sc.next());
                System.out.println("Introduzca la dirección del alumno.");
                alumno.setDireccion(sc.next());

                alumno.setIdAlumno(idAutomatico());
                Inicio.listaAlumno.add(alumno);
                

                System.out.println("¿Desea añadir algún alumno más?  (Si/No)");
                String respuesta = sc.next();

                if (respuesta.equals("No"))
                {

                    alumnoNuevo = false;

                }

            } while (alumnoNuevo); 
		
		
		
	}
	
	public void cargainicial() {
		
		
		
		
		
		
		
		
		
		
		
	}

}
