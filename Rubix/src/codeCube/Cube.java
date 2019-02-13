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
	
	public Cube() {
		resetCube();
	}
	
	public void resetCube() {
		resetTop();
		reset1();
		reset2();
		reset3();
		reset4();
		resetBase();
	}

	private void resetBase() {
		for (int i = 45; i < 53; i++) {
			rubix[1] = Color.YELLOW;
		}
	}

	private void resetTop() {
		for(int i = 0; i < 8; i++) {
			rubix[i] = Color.WHITE;
		}
	}

	private void reset1() {
		// TODO Auto-generated method stub
		
	}

	private void reset2() {
		// TODO Auto-generated method stub
		
	}

	private void reset3() {
		// TODO Auto-generated method stub
		
	}

	private void reset4() {
		// TODO Auto-generated method stub
		
	}
}
