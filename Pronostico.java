//Tengo una duda de si el pronostico no deberia extender de la clase Partido,
// ya que cada nuevo pronostico (cada nueva instancia de esta clase) es siempre 
// sobre tal o cual partido.

//se estructura el pronostico segun el criterio propuesto en el archivo "[IMPORTANTE] Alternativa de (...) .pdf " del Drive.

package integradorUTN;

public class Pronostico /*extends Partido*/{

	//Argumentos, segun lo propuesto por el practico
	//lo declaramos private para que solo puedan modificarse a traves de sus metodos
	
	public Pronostico(String[][] camposProno) {
		// TODO Auto-generated constructor stub
		
		//al crear la instancia del pronostico se le asigna automaticamente
		//el jugador que lo hizo, ronda y partido sobre el que se pronostica, 
		Player = camposProno[0][2];
		Ronda = Integer.parseInt(camposProno[0][0]);
		Partido = Integer.parseInt(camposProno[0][1]);
		//Equipo =
		
		
	}
	
	private int Ronda;
	private int idPronostico;
	private String Player;			// id del jugador/a que hizo ese pronostico
	private int Partido;		// id del partido sobre el cuál se pronosticó
	private int Equipo;
	private String Resultado;	// si GANA, PIERDE o EMPATA... indicando por defecto lo que paso al otro equipo de ese partido 
	
	
	
	
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
	public int getEquipo() {
		return Equipo;
	}
	public void setEquipo(int equipo) {
		Equipo = equipo;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	} 
	
	
	
	
}
