package listaordenadaejemplo;


public class Principal {

	public static void main(String[] args) {
		ListaDePersonasPorEdad lista = new ListaDePersonasPorEdad();
		lista.add(new Persona("Juan", 20, 1.8));
		lista.add(new Persona("Pepe", 84, 1.3));
		lista.add(new Persona("Agustín", 19, 1.9));
		lista.add(new Persona("Aldana", 28, 1.6));
		lista.add(new Persona("Priscila", 32, 1.73));
		lista.add(new Persona("Joaquin", 19, 1.83));
		lista.add(new Persona("Mario", 25, 1.9));
		
		System.out.println(lista.search(28));
		
		/*for (Persona persona : lista) {
			System.out.println(persona);
		}*/

	}

}
