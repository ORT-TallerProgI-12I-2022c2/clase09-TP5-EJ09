package tp5ej09;

public class Idioma {
	private String clave;
	private String nombre;
	private ListaTerminosPorClave listaDeTerminos;
	
	public Idioma(String clave, String nombre) {
		this.clave = clave;
		this.nombre = nombre;
		listaDeTerminos = new ListaTerminosPorClave();
	}
	
	public void agregarTermino(String clave, String valor) {
		listaDeTerminos.add(new Termino(clave, valor));
	}
	
	public String getValorDeTermino(String clave) {
		Termino t = listaDeTerminos.search(clave);
		return t == null ? null : t.getValor();
	}

	public String getClave() {
		return clave;
	}

	
	
	
}
