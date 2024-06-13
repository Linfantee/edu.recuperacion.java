package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

		
		public static String crearNombreFichero() {
			
			
			LocalDate fecha = LocalDate.now();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyy");
			String fechaConvertida = fecha.format(formato);
			String fechaTotal = "Log-".concat(fechaConvertida).concat(".txt");
			
			return fechaTotal;
		}

		
		
	
	
}
