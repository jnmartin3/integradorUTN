package integradorUTN;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AccesoArchivos_Metodo2 {

	//Al crear una instancia de AccesoArchivos, el metodo constructor de la clase lee lo que hay guardado.
	public AccesoArchivos_Metodo2() {
		
		ArrayList <String> listaPronosticos = new ArrayList();    // ArrayList para guardar las lineas del archivo
		ArrayList <String> listaResultados = new ArrayList();
		
		FileReader camino; 					// Objeto donde se guarda el camino al Archivo TXT
		BufferedReader lector;			// Objeto tipo Buffer donde se guarda la lectura hecha al archivo TXT.
		
		//Rutas a los arhivos, modificar segun la estructura de archivos de cada computadora
		String rutaResultados = "E:/JavaProy/cursoUTN/src/integradorUTN/resultados.csv" ;
		String rutaPronosticos = "E:/JavaProy/cursoUTN/src/integradorUTN/pronosticos.csv";
		
		
		//Aqui intento abrir el archivo y lo guardo en cada ArrayList
				
		try {
			camino = new FileReader(rutaPronosticos);
			lector = new BufferedReader(camino);				// lector Buffer definido para lectura
			
			String linea;
			
			while ((linea=lector.readLine()) != null) {	// Hacer Mientras que la linea que se lea no sea null (Fin del Archivo)
				//System.out.println(linea);			// Imprimir una a una cada linea leida
				listaPronosticos.add(linea);				// Carga una a una, a las lineas del archivo TXT en el listatxt
			} 	
		
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());		// Impresion de error imprevisto.
		}
		
		try {
			camino = new FileReader(rutaResultados);
			lector = new BufferedReader(camino);				// lector Buffer definido para lectura
			
			String linea;
			
			while ((linea=lector.readLine()) != null) {	// Hacer Mientras que la linea que se lea no sea null (Fin del Archivo)
				//System.out.println(linea);			// Imprimir una a una cada linea leida
				listaResultados.add(linea);				// Carga una a una, a las lineas del archivo TXT en el listatxt
			} 	
		
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());		// Impresion de error imprevisto.
		}
		
//Hasta aqui tenemos un ArrayList con Strings de cada linea del archivo
		
//Vamos a proceder a dentro de cada linea separar sus elementos para operar con ellos
		
//Primero arrancamos con los pronosticos y luego con los resultados, misma metodologia
		
		String lineaPronosticos;
		
		//ArrayList que almacenara objetos de Pronostico
		//donde cada elemento del array sera un objeto pronostico con 
		//sus elementos ya separados
		ArrayList <Pronostico_Metodo2> pronosticoObj = new ArrayList();
		
		//ciclo que carga en un string cada linea que tenia el archivo
		//genera un array unidimensional "Separado" con los elementos ya separados por coma
		//y crea un objeto Pronostico con argumento cada array de elementos separados
		//de esta forma le enviamos a la clase Pronostico todos los datos y permite
		//crear indefinidas instancias de la misma segun la cantidad de pronosticos que traiga el archivo
		for (int i = 0 ; i < listaPronosticos.size() ; i++) {
			
			lineaPronosticos = listaPronosticos.get(i); // Se guarda en el String lineacsv el contenido que existe indicado por i en el ArrayList
			String[] Separado = lineaPronosticos.split(","); // Se genera el Array String "Separado" ya con los datos de la linea separados.
			
			pronosticoObj.add(new Pronostico_Metodo2(Separado));
				
		}
		
		//Entonces en este bucle decimos que recorra cada objeto pronostico (con sus datos separados)
		//presentes dentro del ArrayList pronosticoObj
		//y opere o bien imprima algo
		for(Pronostico_Metodo2 lineaSeparada : pronosticoObj ) {
			
			System.out.println(lineaSeparada.getPlayer()+" pronostica que "+lineaSeparada.getEquipo()
			+" Gana: "+lineaSeparada.isGana()+", Empata: "+lineaSeparada.isEmpate());
		}
			
//Lo mismo con los resultados
		
		String lineaResultados;
		
		ArrayList <Partido> resultadosObj = new ArrayList();
		
		for (int i = 0 ; i < listaResultados.size() ; i++) {
			
			lineaResultados = listaResultados.get(i); 				// Se guarda en el String lineacsv el contenido que existe indicado por i en el ArrayList
			String[] Separado = lineaResultados.split(",");		// Se genera el Array String "Separado" ya con los datos de la linea separados.
			
			resultadosObj.add(new Partido(Separado));
			
		}
		
		System.out.println(resultadosObj.get(0).getEquipo1()+" metio "
							+resultadosObj.get(0).getGolesEquipo1()+ " goles");
		
		
		/*//Este codigo de arriba reemplaza por completo lo de abajo
		 * 
		int numeroPartido = 1;
				
		for(Partido lineaSeparada : resultadosObj ) {
				
			if(lineaSeparada.getIdPartido() == numeroPartido) {
				System.out.print(lineaSeparada.getEquipo1()+" metio ");
				System.out.println(lineaSeparada.getGolesEquipo1()+ " goles");
			}
		
		}*/
		
		

		

				
	}
	
}
