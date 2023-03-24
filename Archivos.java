//Clase que abre un archivo y lo muestra completo por consola
//solo para pequenios archivos claro!!

package integradorUTN;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Archivos {

	public static void mostrarContenido(String ruta) {
		// TODO Auto-generated method stub
		
		System.out.println("Mostrando archivo " + ruta + " en consola... ");
		
		try {
			for (String linea : Files.readAllLines(Paths.get(ruta))){
			System.out.println(linea);
			}
			
			System.out.println("Archivo impreso exitosamente!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Falla en la apertura del archivo");
			e.printStackTrace();
		}
		
	}

}
