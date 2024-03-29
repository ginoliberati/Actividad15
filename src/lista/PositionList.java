package lista;

import java.util.Iterator;

public interface PositionList<E> extends Iterable<E> {
	/**Retorna un entero representando la cantidad de elementos en la lista
	 * @return tama�o - int
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public int size();
	/**Retorna un booleano indicando si la lista esta vacia o no
	 * @return estavacio - boolean
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public boolean isEmpty();
	/**Retorna la primera posicion de la lista
	 * @return primeraPosicion - Position<E>
	 * @throws EmptyListException - Si la lista esta vacia
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public Position<E> first() throws EmptyListException;
	/**Retorna la ultima posicion de la lista
	 * @return ultimaPosicion - Position<E>
	 * @throws EmptyListException - Si la lista esta vacia
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public Position<E> last() throws EmptyListException;
	/**Retorna la posicion siguiente a p
	 * @param p - Position<E>
	 * @return siguienteAp - Position<E>
	 * @throws InvalidPositionException - Si la position p es nula o invalida
	 * @throws BoundaryViolationException - Si p es la ultima position de la lista
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	/**Retorna la posicion anterior a p
	 * @param p - Position<E>
	 * @return anteriorAp - Position<E>
	 * @throws InvalidPositionException - Si p es nula o invalida
	 * @throws BoundaryViolationException - Si p es la primera posicion de la lista
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	/**A�ade la position con rotulo e al principio de la lista
	 * @param e - E
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public void addFirst(E e);
	/**A�ade la position con rotulo e al final de la lista
	 * @param e - E
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public void addLast(E e);
	/**A�ade la position con rotulo e despues de la position p
	 * @param p - Position<E>
	 * @param e - E
	 * @throws InvalidPositionException - Si p es nula o invalida
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public void addAfter(Position<E> p, E e) throws InvalidPositionException;
	/**A�ade la position con rotulo e antes de la position p
	 * @param p - Position<E>
	 * @param e - E
	 * @throws InvalidPositionException - Si p es nula o invalida
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public void addBefore(Position<E> p, E e) throws InvalidPositionException;
	/**Elimina la position p de la lista y retorna su rotulo
	 * @param p - Position<E>
	 * @return rotuloDeP - E
	 * @throws InvalidPositionException - Si p es nula o invalida
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public E remove(Position<E> p) throws InvalidPositionException;
	/**Cambia el rotulo de p por e, y retorna su anterior rotulo
	 * @param p - Position<E>
	 * @param e - E
	 * @return rotuloViejo - E
	 * @throws InvalidPositionException - Si p es nula o invalida
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public E set(Position<E> p, E e) throws InvalidPositionException;
	
	/**
	 * Devuelve un un iterador de todos los elementos de la lista.
	 * @return Un iterador de todos los elementos de la lista.
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public Iterator<E> iterator();
	
	/**
	 * Devuelve una coleccion iterable de posiciones.
	 * @return Una coleccion iterable de posiciones.
	 * @author - Liberati Gino y Schroeder Franco
	 */
	public Iterable<Position<E>> positions();
}