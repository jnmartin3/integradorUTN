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
		
		List <String> listaPronosticos = new ArrayList<String>();    // ArrayList para guardar las lineas del archivo
		List <String> listaResultados = new ArrayList<String>();
		
		FileReader camino; 					// Objeto donde se guarda el camino al Archivo TXT
		BufferedReader lector;			// Objeto tipo Buffer donde se guarda la lectura hecha al archivo TXT.
		
		//Rutas a los arhivos, modificar segun la estructura de archivos de cada computadora
		String rutaResultados = "E:/JavaProy/cursoUTN/src/integradorUTN/resultados.csv" ;
		String rutaPronosticos = "E:/JavaProy/cursoUTN/src/integradorUTN/pronosticos.csv";
		
		System.out.print("Accesando archivos y creando configuración inicial ");
		delay(400);
		System.out.print(". ");
		delay(400);
		System.out.print(". ");
		delay(400);
		System.out.println(". ");
		delay(400);
		
		//Aqui intento abrir el archivo y lo guardo en cada ArrayList
		
		//Abro archivo de pronosticos del jugador y lo dejo guardado en "lineaPronostico"
		try {
			camino = new FileReader(rutaPronosticos);
			lector = new BufferedReader(camino);				// lector Buffer definido para lectura
			
			String linea;
			
			while ((linea=lector.readLine()) != null) {	// Hacer Mientras que la linea que se lea no sea null (Fin del Archivo)
				//System.out.println(linea);			// Imprimir una a una cada linea leida
				listaPronosticos.add(linea);				// Carga una a una, a las lineas del archivo TXT en el listatxt
			
			} 	
			System.out.println("Acceso correcto al archivo pronosticos.csv");
		
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());		// Impresion de error imprevisto.
		}
		
		delay(500);
		//Abro archivo de resultados reales y lo dejo guardado en "lineaResultados"
		try {
			camino = new FileReader(rutaResultados);
			lector = new BufferedReader(camino);				// lector Buffer definido para lectura
			
			String linea;
			
			while ((linea=lector.readLine()) != null) {	// Hacer Mientras que la linea que se lea no sea null (Fin del Archivo)
				listaResultados.add(linea);				// Carga una a una, a las lineas del archivo TXT en el listatxt
			} 	
			System.out.println("Acceso correcto al archivo resultados.csv");
		
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());		// Impresion de error imprevisto.
		}
		
		delay(500);
		
//Hasta aqui tenemos dos ArrayList con Strings de cada linea del archivo
		
//Vamos a proceder a dentro de cada linea separar sus elementos para operar con ellos
		
//Primero arrancamos con los pronosticos y luego con los resultados, misma metodologia
		
		String lineaPronosticos;
		
		//ArrayList que almacenara objetos de Pronostico
		//donde cada elemento del array sera un objeto pronostico con 
		//sus elementos ya separados
		pronosticoObj = new ArrayList<Pronostico_Metodo2>();
		
		//ciclo que carga en un string "lineaPronosticos" cada linea que tenia el archivo,
		//genera un array unidimensional "Separado" con los elementos ya separados por coma
		//y crea un objeto Pronostico con argumento cada array de elementos separados
		//de esta forma le enviamos a la clase Pronostico todos los datos y permite
		//crear indefinidas instancias de la misma segun la cantidad de pronosticos que traiga el archivo
		for (int i = 0 ; i < listaPronosticos.size() ; i++) {
			
			lineaPronosticos = listaPronosticos.get(i); // Se guarda en el String lineacsv el contenido que existe indicado por i en el ArrayList
			String[] Separado = lineaPronosticos.split(","); // Se genera el Array String "Separado" ya con los datos de la linea separados.
			
			pronosticoObj.add(new Pronostico_Metodo2(Separado));
				
		}
		
				/*//Este codigo de arriba reemplaza por completo lo de abajo
		 * 
		//Entonces en este bucle decimos que recorra cada objeto pronostico (con sus datos separados)
		//presentes dentro del ArrayList pronosticoObj
		//y opere o bien imprima algo
		for(Pronostico_Metodo2 lineaSeparada : pronosticoObj ) {
			
			System.out.println(lineaSeparada.getPlayer()+" pronostica que "+lineaSeparada.getEquipo()
			+" Gana: "+lineaSeparada.isGana()+", Empata: "+lineaSeparada.isEmpate());
		}*/
			
//Lo mismo con los resultados
		
		String lineaResultados;
		
		resultadosObj = new ArrayList<Partido>();
		
		for (int i = 0 ; i < listaResultados.size() ; i++) {
			
			lineaResultados = listaResultados.get(i); 				
			String[] Separado = lineaResultados.split(",");		
			
			resultadosObj.add(new Partido(Separado));
			
		}
	}
		
		public void calcularResultadoApuesta() {
		// TODO Auto-generated method stub


		//las declaro para toda la clase AccesoArchivos para poder usar en sus metodos
//		boolean resultaGana1;
//		boolean resultaEmpate;
		
		Player jugador = new Player(pronosticoObj.get(0).getPlayer());
		
		//Para cada partido evaluo que equipo gana, pierde o empata
		
		for(int i=0;i<resultadosObj.size();i++) {
			
			if(resultadosObj.get(i).getGolesEquipo1()  >  resultadosObj.get(i).getGolesEquipo2()){
				resultaGana1=true; resultaEmpate=false; resultaGana2=false;
			}
			if(resultadosObj.get(i).getGolesEquipo1()  <  resultadosObj.get(i).getGolesEquipo2()){
				resultaGana1=false; resultaEmpate=false; resultaGana2=true;
			}
			if(resultadosObj.get(i).getGolesEquipo1()  ==  resultadosObj.get(i).getGolesEquipo2()){
				resultaGana1=false;resultaEmpate=true; resultaGana2=false;
			}
		
			//La asignacion de puntos se hace cada vez que hay una coincidencia, o sea
			//si pronostica que hay empate y lo hay 				--> 1 punto
			//si pronostica que Gana el equipo 1 y resulta asi 		--> 1 punto
			//si pronostica que Pierde el equipo 1 y resulta asi 	--> 1 punto
			if(pronosticoObj.get(i).getEmpate1() && resultaEmpate) {
				jugador.setPuntos(jugador.getPuntos()+1);
			}else if(pronosticoObj.get(i).getGana1() && resultaGana1) {
				jugador.setPuntos(jugador.getPuntos()+1);
			}else if(pronosticoObj.get(i).getGana2() && resultaGana1==false) {
				jugador.setPuntos(jugador.getPuntos()+1);
			}
		}
				
		System.out.println("");
		System.out.println("---------------------------------------------------");
		System.out.println("");
		System.out.println("Puntos del jugador 1, "+jugador.getNombre()+"--> "+ jugador.getPuntos()+" puntos.");
						
		
	}
	
	private List <Pronostico_Metodo2> pronosticoObj;
	private List <Partido> resultadosObj;
	
	
	private void delay(long milis)
		{
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	public void mostrarPronostico() {
		System.out.println("\nPRONOSTICOS (Jugador "+pronosticoObj.get(0).getPlayer()+")");
		
		for(int k=0;k<pronosticoObj.size();k++) {
			System.out.print("Partido: "+pronosticoObj.get(k).getPartido()+"  ");
			if(pronosticoObj.get(k).getGana1()) System.out.println(pronosticoObj.get(k).getEquipo1()+ " gana");
			if(pronosticoObj.get(k).getEmpate1()) System.out.println("Empate");
			if(pronosticoObj.get(k).getGana2()) System.out.println(pronosticoObj.get(k).getEquipo2()+ " gana");
		
		}
	}
		

	public void mostrarResultados() {
		System.out.println("\nRESULTADOS");
		for(int k=0;k<resultadosObj.size();k++) {
			System.out.println("Partido "+ resultadosObj.get(k).getIdPartido()+": "+
					resultadosObj.get(k).getEquipo1()+" "+ resultadosObj.get(k).getGolesEquipo1()+" VS "+
					resultadosObj.get(k).getGolesEquipo2() +" "+resultadosObj.get(k).getEquipo2()  );
		}
		
	}
	boolean resultaGana1;
	boolean resultaGana2;
	boolean resultaEmpate;
}
