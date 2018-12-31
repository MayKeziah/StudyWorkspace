package fractalSolution;

public class FractalTester {
	private int[] myArray;
	private final int NOT_FOUND = -1;
	
	public FractalTester() {}
	
	public FractalTester(int[] myArray) {
		setArray(myArray);
	}
	
	public int returnFirstNonMatch() {
		int lowBound = 0;
		int highBound = myArray.length - 1;
		while ((highBound - lowBound) > 1) {
			int testBound = (lowBound + highBound) / 2;
			if (myArray[testBound] == testBound) {
				lowBound = testBound;
			}
			else {
				highBound = testBound;
			}
		}
		if ((highBound == (myArray.length-1)) && (myArray[highBound] == highBound)) {
			return NOT_FOUND;
		}
		else if ((lowBound == 0) && (myArray[lowBound] != lowBound)) {
			return lowBound;
		}
		else {
			return highBound;
		}
	}
	
	public void setArray(int[] myArray) {
		this.myArray = myArray;
	}

}
