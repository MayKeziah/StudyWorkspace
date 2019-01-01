package list;

import intNode.Node;

public class LinkedList implements IntList{
	private Node head;
	
	public LinkedList() {
	}
	public LinkedList(Node newHead) {
		this.head = newHead;
	}
	
	/**
	 * @param data the data to insert
	 */
	public void add(int data) {
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
		if (position < 1) {
			throw new IllegalArgumentException("Invalid position: cannot be less than 1.");
		}
		Node current = head;
		for (int i = 1; i < position; i++) {
			if (current.getNext() == null) {
				throw new IllegalArgumentException("Invalid position: Position too large, this list is " + i + " entries in length.");
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
	public void insert(int data, int position) {
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
		Node current = head;
		String toReturn = "[" + current.getData();
		while(current.getNext() != null) {
			current = current.getNext();
			toReturn += ", " + current.getData();
		}
		toReturn += "]";
		System.out.println(toReturn);
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

}
