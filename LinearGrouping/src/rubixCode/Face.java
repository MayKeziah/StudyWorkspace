package rubixCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Face implements rubixFace<Color> {
	private Color[][] face = new Color[3][3];
	
	/**
	 * Constructor: default, null Face
	 * */
	public Face() {} 
	
	/**
	 * Constructor: set face to given color
	 * */
	public Face(Color color) { 
		setFace(color);
	}
	
	/**
	 * Constructor: set face to given array
	 * */
	public Face(Color[][] face) { 
		setFace(face);
	}
	
	/**
	 * Constructor:set face to given Face
	 * */
	public Face(Face face) { 
		this.face = face.getFace();
	}
	
	
	/*****************************************************************/
	
	/**
	 * @return the face
	 */
	public Color[][] getFace() {
		return face;
	}
	
	/**
	 * @param face the face to set
	 */
	public void setFace(Color[][] face) {
		this.face = face;
	}
	
	/**
	 * @param face the face to set
	 */
	public void setFace(Color color) {
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				this.face[i][j] = color;
			}
		}
	}
	
	/**
	 * toString: overrides the toString() method
	 * 
	 * @return a String representation of the face data-field Color[][]
	 * */
	public String toString() {
		String toReturn = "---------------------\n";
		for (int i = 0; i < 3; i++) {
			toReturn += Arrays.toString(face[i]) + "\n\n";
		}
		return toReturn;
	}

}
