package tp5ej09;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaTerminosPorClave extends ListaOrdenadaNodos<String, Termino> {

	@Override
	public int compare(Termino termino1, Termino termino2) {
		return termino1.getClave().compareTo(termino2.getClave());
	}

	@Override
	public int compareByKey(String clave, Termino elemento) {
		return clave.compareTo(elemento.getClave());
	}

}
