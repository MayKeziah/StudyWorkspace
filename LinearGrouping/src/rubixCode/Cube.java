package rubixCode;

public class Cube {
	private Face[] cube = new Face[6];
	
	/**
	 * Constructor: creates a solved cube, all faces are one solid color.
	 * */
	public Cube() {
		reset();
	}

	/**
	 * @return the cube
	 */
	public Face[] getCube() {
		return cube;
	}

	/**
	 * resets the cube to a solved state
	 */
	public void reset() {
		Color[] colors = {Color.BLUE, Color.GREEN, Color.ORANGE, Color.RED, Color.WHITE, Color.YELLOW};
		for(int i = 0; i < 6; i++) {
			cube[i] = new Face(colors[i]);
		}
	}
	
	/**
	 * Overrides the toString method
	 * 
	 * @return a String representation of a Rubix Cube
	 * */
	public String toString() {
		String toReturn = "";
		for(Face elt: cube) {
			toReturn += elt.toString();
		}
		return toReturn;
	}
}
