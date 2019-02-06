package rubixCode;

import linkedList.LinkedList;
import linkedList.Node;

public class Cube {
	private LinkedList sides;
	private Face top;
	private Face base;
	
	/**
	 * Constructor: creates a solved cube, all faces are one solid color.
	 * */
	public Cube() {
		reset();
	}

	/**
	 * @return the sides (LinkedList)
	 */
	public LinkedList getSides() {
		return sides;
	}
	
	/**
	 * @return the top 
	 */
	public Face getTop() {
		return top;
	}
	
	/**
	 * @return the Base 
	 */
	public Face getBase() {
		return base;
	}

	/**
	 * resets the cube to a solved state
	 */
	public void reset() {
		top = new Face(Color.WHITE);
		base = new Face(Color.YELLOW);
		sides = new LinkedList(new Node(new Face(Color.BLUE)));
		Color[] colors = {Color.GREEN, Color.ORANGE, Color.RED};
		for(int i = 0; i < 3; i++) {
			sides.add(new Face(colors[i]));
		}
	}
	
	/**
	 * print: prints the return of the toString method for cube
	 * */
	public void print() {
		System.out.println(toString());
	}
	
	/**
	 * Overrides the toString method
	 * 
	 * @return a String representation of a Rubix Cube
	 * */
	public String toString() {
		return sides.toString() + "-----  TOP:  -----\n" + top.toString() + "\n-----  BASE:  -----\n" + base.toString();
	}
}
