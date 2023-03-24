package integradorUTN;

public class Partido {
	
	//Argumentos, segun lo propuesto por el practico
	//lo declaramos private para que solo puedan modificarse a traves de sus metodos
	
	private int Ronda;
	
	private int idPartido;
	
	private String Equipo1;		//aqui trabajamos con el id del equipo y no su nombre que seria un String
	
	private String Equipo2;		//aqui trabajamos con el id del equipo y no su nombre que seria un String
	
	private int golesEquipo1;
	
	private int golesEquipo2;
	
	public Partido(String[] Resultado) {
		
		Ronda = Integer.parseInt(Resultado[0]);
		idPartido = Integer.parseInt(Resultado[1]);
		Equipo1 = Resultado[2];
		Equipo2 = Resultado[3];
		golesEquipo1 = Integer.parseInt(Resultado[4]);
		golesEquipo2 = Integer.parseInt(Resultado[5]);
	}
	
	//Metodos getters y setters que permiten acceder a los argumentos de forma controlada
	
	public int getRonda() {
		return Ronda;
	}

	public void setRonda(int ronda) {
		Ronda = ronda;
	}
	
	public int getIdPartido() {
		return idPartido;
	}
	

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}
	
	public String getEquipo1() {
		return Equipo1;
	}
	
	public void setIdEquipo1(String i) {
		this.Equipo1 = i;
	}
	
	public String getEquipo2() {
		return Equipo2;
	}
	
	public void setIdEquipo2(String i) {
		this.Equipo2 = i;
	}
	
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

}
