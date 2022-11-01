package tp5ej09;

public class Principal {

	public static void main(String[] args) {
		Saludador salu = new Saludador("IT");
		
		Idioma esp = new Idioma("ES", "Español");
		Idioma ing = new Idioma("EN", "English");
		Idioma ita = new Idioma("IT", "Italiano");
		
		esp.agregarTermino("BIENVENIDA", "¡Bienvenid@!");
		esp.agregarTermino("PEDIR_NOMBRE", "Ingresá tu nombre");
		esp.agregarTermino("SALUDO", "Hola");
		esp.agregarTermino("DESPEDIDA", "¡Adiós!");		
		
		ing.agregarTermino("BIENVENIDA", "Welcome!");
		ing.agregarTermino("PEDIR_NOMBRE", "Enter your name");
		ing.agregarTermino("SALUDO", "Hello");
		ing.agregarTermino("DESPEDIDA", "Goodbye!");
		
		ita.agregarTermino("BIENVENIDA", "Benvenuto!");
		ita.agregarTermino("PEDIR_NOMBRE", "Inserisci il tuo nome");
		ita.agregarTermino("SALUDO", "Ciao");
		ita.agregarTermino("DESPEDIDA", "Ciao");
		
		salu.agregarIdioma(esp);
		salu.agregarIdioma(ing);
		salu.agregarIdioma(ita);
		
		salu.iniciarPrograma();

	}

}
