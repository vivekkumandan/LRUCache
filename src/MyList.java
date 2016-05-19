
public class MyList<T1, T2> {
	private int size;
	private Node<T1,T2> head = null;
	private Node<T1, T2> tail = null;
	void setSize (int size) {
		this.size = size;
	}
	int getSize () {
		return size;
	}
	void setHead (Node<T1, T2> head) {
		this.head = head;
	}
	Node<T1, T2> getHead () {
		return head;
	}
	void setTail (Node<T1, T2> tail) {
		this.tail = tail;
	}
	Node<T1, T2> getTail () {
		return tail;
	}
	void incrementSize() {
		size++;
	}
}
