package clases;

public class Gerente extends Persona {
	
    String usuario, clave;
	
	
	public void setusuario(String usuario) {
		this.usuario=usuario;
	}
	public void setclave(String clave) {
		this.clave=clave;
	}
    
	public String getusuario() {
		return usuario;
	}
	public String getclave() {
		return clave;
	}

}
