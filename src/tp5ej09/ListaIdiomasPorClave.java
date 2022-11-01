package tp5ej09;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaIdiomasPorClave extends ListaOrdenadaNodos<String, Idioma> {

	@Override
	public int compare(Idioma i1, Idioma i2) {
		return i1.getClave().compareTo(i2.getClave());
		//return compareByKey(i1.getClave(), i2);
	}

	@Override
	public int compareByKey(String clave, Idioma elemento) {
		return clave.compareTo(elemento.getClave());
	}

}
