package list;

import intNode.Node;

public class LinkedList implements IntList{
	private int size;
	private Node head;
	
	public LinkedList() {
	}
	public LinkedList(Node newHead) {
		this.head = newHead;
		size = 1;
	}
	
	/**
	 * @param data the data to insert
	 */
	public void add(int data) {
		insert(data, size);
	}
	
	/**
	 * @param position the position of the Node to delete
	 */
	public void delete(int position) {
		Node prior = getEntry(position - 1);
		Node post = prior.getNext().getNext();
		prior.setNext(post);
		size--;
		
	}
	
	/**
	 * @param position the position of the Node to get
	 * @return the Node at the given position
	 */
	public Node getEntry(int position) {
		Node current = head;
		for (int i = 1; i < position; i++) {
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
	 * @return the size
	 */
	public int getSize() {
		return size;
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
		size++;
	}
	
	/**
	 * @output prints a representation of the list to the console in format: [0, 0, 0, 0]
	 */
	public void print() {
		Node current = head;
		String toReturn = "[" + current.getData();
		for (int i = 2; i <= size; i++) {
			current = current.getNext();
			toReturn += ", " + current.getData();
		}
		toReturn += "]";
		System.out.println(toReturn);
	}
	
	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		Node positionTwo = this.head.getNext();
		this.head = head;
		head.setNext(positionTwo);
	}

}
