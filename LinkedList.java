package projectCSC212;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> current;

	public LinkedList () {
		head = current = null;
	}

	public boolean empty () {
		return head == null;
	}

	public boolean last () {
		return current.next == null;
	}
        public boolean full () {
		return false;
	}
	public void findfirst () {
		current = head;
	}
	public void findnext () {
		current = current.next;
	}
	public T retrieve () {
		return current.data;
	}
	public void update (T val) {
		current.data = val;
	}}