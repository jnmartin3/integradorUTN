//Tengo una duda de si el pronostico no deberia extender de la clase Partido,
// ya que cada nuevo pronostico (cada nueva instancia de esta clase) es siempre 
// sobre tal o cual partido.

//se estructura el pronostico segun el criterio propuesto en el archivo "[IMPORTANTE] Alternativa de (...) .pdf " del Drive.

package integradorUTN;

import java.util.ArrayList;

public class Pronostico_Metodo2 /*extends Partido*/{

	//Argumentos, segun lo propuesto por el practico
	//lo declaramos private para que solo puedan modificarse a traves de sus metodos
	
	public Pronostico_Metodo2(String[] Pronostico) {
		// TODO Auto-generated constructor stub
		
		Ronda = Integer.parseInt(Pronostico[0]);
		Partido = Integer.parseInt(Pronostico[1]);
		Player = Pronostico[2];		
		Equipo1 = Pronostico[3];
		Equipo2 = Pronostico[7];
		Gana1 = Boolean.parseBoolean(Pronostico[4]);
		Gana2 = Boolean.parseBoolean(Pronostico[5]);
		Empate = Boolean.parseBoolean(Pronostico[6]);
				
	}
	
	private int Ronda;
	private int idPronostico;
	private String Player;			// id del jugador/a que hizo ese pronostico
	private int Partido;		// id del partido sobre el cuál se pronosticó
	private String Equipo1;
	private String Equipo2;
//	private String Resultado;	// si GANA, PIERDE o EMPATA... indicando por defecto lo que paso al otro equipo de ese partido 
	private boolean Gana1;
	private boolean Gana2;
	private boolean Empate;
		
	
	//Metodos getters y setters que permiten acceder a los argumentos de forma controlada

	public boolean getGana1() {
		return Gana1;
	}
	public boolean getEmpate1() {
		return Empate;
	}
	public int getRonda() {
		return Ronda;
	}
	public void setRonda(int ronda) {
		Ronda = ronda;
	}
	public int getIdPronostico() {
		return idPronostico;
	}
	/*public void setIdPronostico(int idPronostico) {
		this.idPronostico = idPronostico;
	}*/
	public String getPlayer() {
		return Player;
	}
	
	public int getPartido() {
		return Partido;
	}
	public void setPartido(int partido) {
		Partido = partido;
	}
	public String getEquipo1() {
		return Equipo1;
	}
	public void setEquipo1(String equipo) {
		Equipo1 = equipo;
	}
//	public String getResultado() {
//		return Resultado;
//	}
//	public void setResultado(String resultado) {
//		Resultado = resultado;
//	} 
	public String getEquipo2() {
		return Equipo2;
	}
	public void setEquipo2(String equipo2) {
		Equipo2 = equipo2;
	}
	public boolean getGana2() {
		return Gana2;
	}
	public void setGana2(boolean gana2) {
		Gana2 = gana2;
	}
	
	
	
	
}
