package Cola;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

import Exception.ColaExceededSizeException;
import Exception.ElementBlockedException;
import Exception.LlevateTuNullDeAquiException;

public class ColaDelCastigo {

	TreeSet<ColaDelCastigo> cola = new TreeSet<ColaDelCastigo>();

	// Metodo que lanza una execpcion si el tamao de la cola es mayor a 10
	public void size(TreeSet<Integer> e) throws Exception {

		if (e.size() > 10) {

			throw new Exception(new ColaExceededSizeException("La cola no puede tener mas de 10 numeros"));
		}

	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<ColaDelCastigo> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends ColaDelCastigo> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

// Metodo que lanxa una exepcion si intentas borras la cola
	public void clear(TreeSet<Integer> a) throws Exception {

		throw new Exception(new ElementBlockedException("Esta lista no se puede limpiar"));

	}

// Metodo que lanza una excepcion si añades una valor null a la cola
	public void add(TreeSet<Integer> a) throws Exception {
		if (a == null) {

			throw new Exception(new LlevateTuNullDeAquiException("El valor no puede ser nulo"));
		}

	}

	public boolean offer(ColaDelCastigo e) {
		// TODO Auto-generated method stub
		return false;
	}

	public ColaDelCastigo remove() {
		// TODO Auto-generated method stub
		return null;
	}

	public ColaDelCastigo poll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ColaDelCastigo element() {
		// TODO Auto-generated method stub
		return null;
	}

	public ColaDelCastigo peek() {
		// TODO Auto-generated method stub
		return null;
	}

	// Comparador
	public boolean compareTo(ColaDelCastigo a) {
		boolean comparacion = cola == a.cola;
		if (comparacion == true) {
			return cola != null;
		}

		return comparacion;
	}

	// Contructor
	public ColaDelCastigo() {
		super();
		this.cola = cola;
	}

}
