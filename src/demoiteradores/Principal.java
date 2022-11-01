package demoiteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		TreeSet<String> nombres = new TreeSet<>();
		
		nombres.add("María");
		nombres.add("Juan");
		nombres.add("Ana");
		nombres.add("Luis");
		nombres.add("Pepe");
		
		Iterator<String> it = nombres.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
