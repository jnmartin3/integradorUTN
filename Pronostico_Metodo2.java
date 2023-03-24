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
		Equipo = Pronostico[3];
		Gana = Boolean.parseBoolean(Pronostico[5]);
		Empate = Boolean.parseBoolean(Pronostico[6]);
				
	}
	
	private int Ronda;
	private int idPronostico;
	private String Player;			// id del jugador/a que hizo ese pronostico
	private int Partido;		// id del partido sobre el cuál se pronosticó
	private String Equipo;
	private String Resultado;	// si GANA, PIERDE o EMPATA... indicando por defecto lo que paso al otro equipo de ese partido 
	private boolean Gana;
	
	public boolean isGana() {
		return Gana;
	}
	public boolean isEmpate() {
		return Empate;
	}

	private boolean Empate;
	
	
	
	//Metodos getters y setters que permiten acceder a los argumentos de forma controlada

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
	public String getEquipo() {
		return Equipo;
	}
	public void setEquipo(String equipo) {
		Equipo = equipo;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	} 
	
	
	
	
}
