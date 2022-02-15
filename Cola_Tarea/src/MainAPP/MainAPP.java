package MainAPP;

import java.util.Iterator;
import java.util.TreeSet;

import javax.print.attribute.Size2DSyntax;

import Cola.ColaDelCastigo;


public class MainAPP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ColaDelCastigo colaCastigo = new ColaDelCastigo();

		TreeSet<Integer> cola = new TreeSet<Integer>() ;

		cola.add(1);
		cola.add(2);
		cola.add(3);
		cola.add(4);
		cola.add(5);
		cola.add(6);
		cola.add(43);
		cola.add(8);
		cola.add(42);
		cola.add(23);
		
		
		for (Integer i : cola) {

			System.out.println(i);
		}

		
		// Pruebas realizada para comprobar las excepciones 
		
//		colaCastigo.size(cola); // Debes añadir un campo mas a la cola
//		colaCastigo.add(null);  // Debes introducir un valor null a la cola
//		colaCastigo.clear(cola); // Intenta borrar la cola creada
//		colaCastigo.compareTo(colaCastigo); // Comparador
	}	

}
