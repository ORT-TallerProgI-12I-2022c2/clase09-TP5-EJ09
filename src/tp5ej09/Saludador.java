package tp5ej09;

import java.util.Scanner;

public class Saludador {
	
	private String claveIdiomaActual;
	private Diccionario dicc;
	
	public Saludador() {
		this("ES");
	}
	
	public Saludador(String claveIdioma) {
		this.dicc = new Diccionario();
		this.claveIdiomaActual = claveIdioma;
	}
	
	public void agregarIdioma(Idioma i) {
		dicc.agregarIdioma(i);
	}	
	
	public void iniciarPrograma() {
		Scanner input = new Scanner(System.in);
		System.out.println( dicc.getTermino(claveIdiomaActual, "BIENVENIDA")  );
		System.out.println( dicc.getTermino(claveIdiomaActual, "PEDIR_NOMBRE"));
		String nombre = input.nextLine();
		System.out.println(dicc.getTermino(claveIdiomaActual, "SALUDO") + " " + nombre);
		System.out.println(dicc.getTermino(claveIdiomaActual, "DESPEDIDA"));
	}
}
