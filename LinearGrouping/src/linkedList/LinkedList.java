package linkedList;

import rubixCode.Face;

public class LinkedList implements FaceList{
	private Node head;
	
	public LinkedList() {
	}
	public LinkedList(Node newHead) {
		this.head = newHead;
	}
	
	/**
	 * @param data the data to insert
	 */
	public void add(Face data) {
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node(data));
	}
	
	/**
	 * @param position the position of the Node to delete
	 */
	public void delete(int position) {
		if (position == 1) {
			setHead(head.getNext());
		}
		else {
			Node prior = getEntry(position - 1);
			Node post = prior.getNext().getNext();
			prior.setNext(post);
		}		
	}
	
	/**
	 * @param position the position of the Node to get
	 * @return the Node at the given position
	 */
	public Node getEntry(int position) {
		if (position < 0) {
			throw new IllegalArgumentException("Invalid position: cannot be less than 0.");
		}
		Node current = head;
		if (position == 0) {
			return current;
		}
		for (int i = 0; i < position - 1; i++) {
			if (current.getNext() == null) {
				throw new IllegalArgumentException("Invalid position: Position too large, this list is " + (i + 1) + " entries in length.");
			}
			current = current.getNext();
			
		}
		return current;
	}
	
	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * @param data the data to insert, 
	 * @param position the Node count after which to insert (count from 1).
	 */
	public void insert(Face data, int position) {
		Node temp;
		if (position == 0) {
			temp = head;
			this.setHead(new Node(data, temp));
		}
		else {
			Node prior = getEntry(position);
			temp = prior.getNext();
			prior.setNext(new Node(data));
			if (temp != null) {
				prior.getNext().setNext(temp);
			}
		}
	}
	
	/**
	 * @output prints a representation of the list to the console in format: [0, 0, 0, 0]
	 */
	public void print() {
		System.out.println(toString());
	}
	
	/**
	 * @param head the head to replace current
	 */
	public void replaceHead(Node head) {
		Node positionTwo = this.head.getNext();
		this.setHead(head);
		head.setNext(positionTwo);
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	
	/**
	 * toString
	 * 
	 * @return a String representation of the list
	 * */
	public String toString() {
		Node current = head;
		String toReturn = current.getData().toString();
		while(current.getNext() != null) {
			current = current.getNext();
			toReturn += current.getData();
		}
		return toReturn;
	}

}
