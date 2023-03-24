package integradorUTN;

public class Equipo {

	//Argumentos, segun lo propuesto por el practico
	//lo declaramos private para que solo puedan modificarse a traves de sus metodos
	
	private int idEquipo;
	private String nombreEquipo;
	private String descripcionEquipo;
	
	
	//Metodos getters y setters que permiten acceder a los argumentos de forma controlada
	
	public int getIdEquipo() {
		return idEquipo;
	}
	
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	public String getDescripcionEquipo() {
		return descripcionEquipo;
	}
	
	public void setDescripcionEquipo(String descripcionEquipo) {
		this.descripcionEquipo = descripcionEquipo;
	}
}
