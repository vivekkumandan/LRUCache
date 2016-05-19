
public class Node<T1, T2> {
	private T1 key;
	private T2 element;
	private Node<T1, T2> next;
	private Node<T1, T2> previous;
	Node (T1 key, T2 element) {
		this.key = key;
		this.element = element;
		next = null;
		previous = null;
	}
	void setKey (T1 key) {
		this.key = key;
	}
	T1 getKey () {
		return this.key;
	}
	void setElement (T2 element) {
		this.element = element;
	}
	T2 getElement () {
		return this.element;
	}
	void setNext (Node<T1, T2> next) {
		this.next = next;
	}
	Node<T1,T2> getNext () {
		return next;
	}
	void setPrevious (Node<T1, T2> previous) {
		this.previous = previous;
	}
	Node<T1,T2> getPrevious () {
		return previous;
	}
}
