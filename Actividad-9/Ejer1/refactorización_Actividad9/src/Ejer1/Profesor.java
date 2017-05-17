package Ejer1;

import java.util.List;



	 public class Profesor extends Persona{
		 
		 public Profesor(String numeroDeTelefono) {
			super(numeroDeTelefono);
			
		}

		private String nombre;
		 private int edad;
		 
		 List<Prestamo>prestamo;
		 
		 
		 public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		
		 
		 public void printInformacionPersonal(){
			 
			 System.out.println("Nombre: " + nombre);
			 System.out.println("Edad: "+ edad);
			 System.out.println("Teléfono:" + numeroDeTelefono);
			 
		 }
		 
		 public void printTodaLaInformacion(){
			 
			this.printInformacionPersonal();
			
			 for(Prestamo p: prestamo){
				System.out.println(p); 
			 }
			 }
	 }
