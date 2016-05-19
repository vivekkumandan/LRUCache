import java.util.HashMap;

public class LRUCache<T1, T2> {
	
	private int maxSize;
	private HashMap<T1, Node<T1, T2>> hm = new HashMap<T1, Node<T1, T2>>();
	private MyList<T1, T2> ll = new MyList<T1, T2>();
	LRUCache (int maxSize) {
		this.maxSize = maxSize;
	}
	
	T2 search (T1 t1) {
		if(hm.containsKey(t1)) {
			Node<T1,T2> node = hm.get(t1);
			removeTheNode(node);
			addNodeToLast(node);
			return node.getElement();
		}
		else {
			return null;
		}
	}
	
	void add (T1 t1, T2 t2) {
		if (hm.containsKey(t1)) {
			Node<T1, T2> node = hm.get(t1);
			node.setElement(t2);
			removeTheNode(node);
			addNodeToLast(node);
		}
		else {
			if (ll.getSize() < maxSize) {
				Node<T1, T2> newNode = new Node<T1, T2>(t1, t2);
				hm.put(t1, newNode);
				addNodeToLast(newNode);
				ll.incrementSize();
			}
			else {
				Node<T1, T2> newNode = new Node<T1, T2>(t1, t2);
				hm.put(t1, newNode);
				removeFirstNode();
				addNodeToLast(newNode);
			}
		}
	}
	
	private void addNodeToLast(Node<T1, T2> node) {
		Node<T1, T2> currentLastNode = ll.getTail();
		if(currentLastNode != null) {
			currentLastNode.setNext(node);
			node.setPrevious(currentLastNode);
			ll.setTail(node);
		}
		else {
			ll.setHead(node);
			ll.setTail(node);
		}
	}
	
	private void removeFirstNode() {
		Node<T1, T2> currentFirstNode = ll.getHead();
		Node<T1, T2> currentSecondNode = currentFirstNode.getNext();
		currentSecondNode.setPrevious(null);
		ll.setHead(currentSecondNode);
		T1 key = currentFirstNode.getKey();
		hm.remove(key);
	}
	
	private void removeTheNode(Node<T1, T2> node) {
		Node<T1, T2> previousNode = node.getPrevious();
		if(previousNode != null) {
			Node<T1, T2> nextNode = node.getNext();
			if (nextNode != null) {
				previousNode.setNext(nextNode);
				nextNode.setPrevious(previousNode);
			}
			else {
				ll.setTail(previousNode);
				previousNode.setNext(null);
			}
		}
		else {
			Node<T1, T2> nextNode = node.getNext();
			ll.setHead(nextNode);
			nextNode.setPrevious(null);
		}
	}
	
	void print() {
		Node<T1, T2> node = ll.getHead();
		while (node != null) {
			System.out.print(node.getKey() + "-" + node.getElement() + ",  ");
			node = node.getNext();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// create LRUCache of key and value clases specified
		// see that key class has both equals and hashCode methods implemented
		// the capacity of the cache has to be given during initiation
		LRUCache<Integer, String> LRUCache1 = new LRUCache<Integer, String>(5);
		//.add(key, value) adds the key value objects to the cache
		//.search(key) searches for the key and returns the value
		//.print() prints the cache content in order (Least Recently Used to Most Recently Used)
		LRUCache1.add(1, "one");
		LRUCache1.add(2, "two");
		LRUCache1.add(3, "three");
		LRUCache1.print();
		LRUCache1.add(4, "four");
		LRUCache1.add(5, "five");
		LRUCache1.add(1, "one");
		LRUCache1.add(6, "six");
		LRUCache1.print();
		LRUCache1.add(2, "two");
		LRUCache1.print();
	}

}
