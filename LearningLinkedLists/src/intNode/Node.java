package intNode;

public class Node {
	private int data;
	private Node next;
	
	public Node() {}
	public Node(int newData) {
		setData(newData);
	}
	public Node(int newData, Node newNext) {
		setData(newData);
		setNext(newNext);
	}
	
	/**
	 * @return the data
	 */
	public int getData() {
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
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
