package lista;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ElementIterator<E> implements Iterator<E> {
	private PositionList<E> list;
	private Position<E> cursor;
	
	public ElementIterator(PositionList<E> l) {
		try{
			list=l;
			cursor = (l.isEmpty())? null:l.first();
		} catch (EmptyListException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public E next() throws NoSuchElementException {
		if (!hasNext()) {
			throw new NoSuchElementException("No tiene siguiente.");
		}
		E elem=cursor.element();
		
		try {	
			cursor = (cursor==list.last())? null:list.next(cursor);
		} catch (BoundaryViolationException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPositionException e) {
			System.out.println(e.getMessage());
		} catch (EmptyListException e) {
			System.out.println(e.getMessage());
		}
		
		return elem;
	}
	
	public boolean hasNext() {
		return cursor!=null;
	}
}
