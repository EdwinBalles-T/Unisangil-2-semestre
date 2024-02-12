package clases;

public class Persona {
        
	 private int id, edad;
		private String nombre, apellido;
		 private double estatura, peso;
		  private char genero;

		
		//metodos getter
		public int getId() {
		 return this.id;
		}
		public int getedad() {
		 return this.edad;
		}
		public String getnombre() {
		 return this.nombre;
		}
		public String getapellido() {
		 return this.apellido;
		}
		public double getestatura() {
		 return this.estatura;
		}
		public double getpeso() {
		 return this.peso;
		}
		public char getgenero() {
		 return this.genero;
		}
		//metodos setters
		
	  /*visibilidad   tipo_de_valor_de_retorno   nombre_del_metodo   (parametros) {
	  
	  }*/
		
		public void setId(int id) {
			this.id=id;
			}
			public void setnombre(String nombre) {
				this.nombre=nombre;
			}
				public void setapellido(String apellido) {
					this.apellido=apellido;
				}
					public void setedad(int edad) {
						this.edad=edad;
					}
						public void setestatura(double estatura){
							this.estatura=estatura;
						}
							public void setpeso(double peso) {
								this.peso=peso;
							}
								public void setgenero(char genero) {
									this.genero=genero;
								}
}
