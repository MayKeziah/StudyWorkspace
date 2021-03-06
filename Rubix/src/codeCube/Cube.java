/**
 * 
 */
package codeCube;

/**
 * @author E
 *
 */
public class Cube {
	private Color[] rubix =  new Color[54];
	private final int[] sideIndexZero = {9, 12, 15, 18};
	private final Color[] colorChoice = {Color.BLUE, Color.GREEN, Color.ORANGE, Color.RED, 
										Color.WHITE, 
										Color.YELLOW};
	
	public Cube() {
		resetCube();
	}
	
	public Color[] getRubix() {
		return rubix;
	}
	
	public void resetCube() {
		resetTop();
		resetSides();
		resetBase();
	}

	private void resetSides() {
		for(int side = 0; side < 4; side++) {
			resetSide(sideIndexZero[side], colorChoice[side]);
		}
	}

	private void resetBase() {
		for (int i = 45; i < 53; i++) {
			rubix[i] = colorChoice[5];
		}
	}

	private void resetTop() {
		for(int i = 0; i < 9; i++) {
			rubix[i] = colorChoice[4];
		}
	}

	private void resetSide(int start, Color color) {
		for(int i = start; i < start + 3; i++) {
			for (int j = i; j < start + 16; j += 12) {
				rubix[j] = color;
			}
		}
		
	}
	public String toString() {
		String toReturn = "";
		for (int i = 0; i < 7; i++) {
			for(int j = i; j < 9; j+=3) {
				//TODO:
			}
		}
		return toReturn;
	}
}
