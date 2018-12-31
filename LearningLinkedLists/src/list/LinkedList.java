package list;

import intNode.Node;

public class LinkedList implements IntList{
	Node head;
	
	public LinkedList() {}
	public LinkedList(Node newHead) {
		setHead(newHead);
	}

	
	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}
	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}
	
	

}
