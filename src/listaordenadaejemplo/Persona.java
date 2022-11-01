package listaordenadaejemplo;

import java.util.Collections;

public class Persona /* implements Comparable<Persona> */ {
	private String nombre;
	private int edad;
	private double estatura;
	
	public Persona(String nombre, int edad, double estatura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}

	/*
	@Override
	public int compareTo(Persona o) {
		int dif = this.getEdad() - o.getEdad();
		if (dif == 0) {
			dif = getNombre().compareTo(o.getNombre());
		}
		return dif;
	}
	*/
	
	
	
}
