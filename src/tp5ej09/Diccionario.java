package tp5ej09;

public class Diccionario {
	private ListaIdiomasPorClave listaDeIdiomas;

	public Diccionario() {
		this.listaDeIdiomas = new ListaIdiomasPorClave();
	}
	
	public void agregarIdioma(Idioma i) {
		this.listaDeIdiomas.add(i);
	}
	
	public void agregarTermino(String claveIdioma, String claveTermino, String valorTermino) {
		getIdioma(claveIdioma).agregarTermino(claveTermino, valorTermino);
	}
	
	public String getTermino(String claveIdioma, String claveTermino) {
		return getIdioma(claveIdioma).getValorDeTermino(claveTermino);
	}
	
	public Idioma getIdioma(String clave) {
		return this.listaDeIdiomas.search(clave);
	}
	
	
}
