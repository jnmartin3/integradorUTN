//Clase del jugador/a donde se registran sus particularidades,
// idPlayer
// nombre
// otros...

package integradorUTN;

public class Player {
	
	public Player() {
		
		
	}
	
	//Argumentos de clase
	
	private int idPlayer;
	
	private String nombre;
	
	private int puntos;
	
	//Getters y Setters
	
	public int getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	

}
