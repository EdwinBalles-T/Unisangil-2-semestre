package clases;

public class Vigilante extends Persona {
	
	private String nivel;
	private int dotacion;
	 
	public void setnivel(String nivel) {
		this.nivel=nivel;
	}
	public void setdotacion(int dotacion) {
		this.dotacion=dotacion;
	}

	public String getnivel() {
		return nivel;
	}
	public int getdotacion() {
		return dotacion;
	}

}
