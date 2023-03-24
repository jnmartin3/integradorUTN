package integradorUTN;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AccesoArchivos {

	//Al crear una instancia de AccesoArchivos, el metodo constructor de la clase lee lo que hay guardado.
	public AccesoArchivos() {
		
		//Rutas a los arhivos, modificar segun la estructura de archivos de cada computadora
		String rutaResultados = "E:/JavaProy/cursoUTN/src/integradorUTN/resultados.csv" ;
		String rutaPronosticos = "E:/JavaProy/cursoUTN/src/integradorUTN/pronosticos.csv";
		
		//Arreglo bidimensional (tabla) de 2 filas y 6 columnas
		//que uso para "alojar" los datos del archivo resultadod
		String[][] camposPartidos = new String[2][6];
		int i = 0;
		
		String[][] camposProno = new String[2][6];
		int j = 0;
	
		//Metodo que cree para mostrar rapidamente por consola que contiene cada archivo
		//hay que enviarle la ruta del archivo a abrir
		Archivos.mostrarContenido(rutaResultados);
						
		try {
			
			//para cada linea del archivo que estoy abriendo... 
			for (String linea : Files.readAllLines(Paths.get(rutaResultados))){
				
				//la corto segun los separadores coma "," y se la asigno a la fila i
				camposPartidos[i] = linea.split(",");
				
				/* PA DESPUES
				 * validacion de extension de linea de cada archivo usando
				 * campos.lenght que devuelve cantidad de elementos como int
				 */
				
				//incremento el valor de la fila para el proximo bucle
				i++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
		
			for (String linea : Files.readAllLines(Paths.get(rutaPronosticos))){
				
				camposProno[j] = linea.split(",");
				
				j++;
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		//al salir del try-catch tengo un arreglo de dos dimensiones
		//cuyas filas contienen las lineas del archivo, separadas
		
		//sabiendo donde se ubica cada dato puedo acceder, leer, operar con ellos, etc. 
		//por ejemplo imprimiendo el elemento 4 de la segunda fila	
		
		/* #### Ejemplos de uso  #####
		
			System.out.println(campos[1][3]);
			
			if(Integer.parseInt(campos[0][4]) > Integer.parseInt(campos[0][5])) System.out.println("Gano " + campos[0][2]);
		
		*/
		
		//Creamos instancias de las clases Partido para asignar lo leido en el archivo csv
		//hacemos lo mismo 2 veces porque hay dos partidos en esta ronda
		
		/*
		Partido partido1 = new Partido();
		
		Partido partido2 = new Partido();
		
		cargaPartidos(camposPartidos, partido1);
		
		cargaPartidos(camposPartidos, partido2);
		
		//Creamos al jugador/a que hace los pronosticos
		
		Player jugador1 = new Player();
		
		cargaJugador(camposProno, jugador1);
		
		//Creamos los pronosticos de ese jugador, sobre los dos partidos
		
		Pronostico pronostico1 = new Pronostico(camposProno);	//aca no se como definirle a la clase
		//que seleccione solo la fila 1, del primer pronostico... y sucesivamente si creamos automaticamente
		//todos los pronosticos de un archivo, como se le diria a la clase eso. 
				
		System.out.println(pronostico1.getPlayer());
		
		*/
		
		
		
		
	}
	

	private void cargaJugador(String[][] camposProno, Player jugador) {
		
		jugador.setIdPlayer(1);
		
		jugador.setNombre(camposProno[0][2]);
				
	}

	private void cargaPartidos(String[][] camposPartidos, Partido partido) { //, int ronda, int idPartido, int idEquipo1, int idEquipo2, int golesEquipo1, int golesEquipo2) {
		
		partido.setRonda(Integer.parseInt(camposPartidos[0][0]));
		
		partido.setIdPartido(1);		//estos 3 deberian automatizarse tambien, por ejemplu usando ENUM
		
//		partido.setIdEquipo1(22);
//		
//		partido.setIdEquipo2(34);
		
		partido.setGolesEquipo1(Integer.parseInt(camposPartidos[0][4]));
		
		partido.setGolesEquipo2(Integer.parseInt(camposPartidos[0][5]));
		
	}
	
}
