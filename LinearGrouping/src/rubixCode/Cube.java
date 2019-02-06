package rubixCode;

import linkedList.LinkedList;
import linkedList.Node;

public class Cube {
	private Node head = new Node(new Face(Color.BLUE));
	private LinkedList cube = new LinkedList(head);
	
	/**
	 * Constructor: creates a solved cube, all faces are one solid color.
	 * */
	public Cube() {
		reset();
	}

	/**
	 * @return the cube's head (Node)
	 */
	public LinkedList getCube() {
		return cube;
	}

	/**
	 * resets the cube to a solved state
	 */
	public void reset() {
		head = new Node(new Face(Color.BLUE));
		cube = new LinkedList(head);
		Color[] colors = {Color.GREEN, Color.ORANGE, Color.RED, Color.WHITE, Color.YELLOW};
		for(int i = 0; i < 5; i++) {
			cube.add(new Face(colors[i]));
		}
	}
	
	/**
	 * Overrides the toString method
	 * 
	 * @return a String representation of a Rubix Cube
	 * */
	public String toString() {
		String toReturn = "";
		for(int i = 0; i < 6; i++) {
			toReturn += cube.getEntry(i).getData().toString();
		}
		return toReturn;
	}
}
