package listaordenadaejemplo;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDePersonasPorEdad extends ListaOrdenadaNodos<Integer, Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {		
		// Lista ordenada de forma ascendente (de menor a mayor)
		int dif = p1.getEdad() - p2.getEdad();
		return dif;
		
		// Si las personas son comparables, le delegamos esta lógica a ellas:
		// return p1.compareTo(p2);
	}

	@Override
	public int compareByKey(Integer clave, Persona elemento) {
		// TODO Auto-generated method stub
		return clave - elemento.getEdad();
	}

}
