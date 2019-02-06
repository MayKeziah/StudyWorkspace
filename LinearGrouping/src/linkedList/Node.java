package linkedList;

import rubixCode.Face;

public class Node {
	private Face data;
	private Node next;
	
	public Node() {}
	public Node(Face newData) {
		setData(newData);
	}
	public Node(Face newData, Node newNext) {
		setData(newData);
		setNext(newNext);
	}
	
	/**
	 * @return the data
	 */
	public Face getData() {
		return data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(Face data) {
		this.data = data;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
