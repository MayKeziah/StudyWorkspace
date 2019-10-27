/**
 * 
 */
package myCode;

import fractalSolution.FractalTester;

/**
 * @author E
 *
 */
public class TestMostRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] testBegin = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] testEvenMiddle = {0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12};
		int[] testOddMiddle = {0, 1, 2, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 9, 10, 11};
		int[] testEnd = {0, 1, 2, 3, 4, 5, 6, 7, 9};
		int[] testNotFound = {0, 1, 2, 3, 4, 5, 6, 7};
		int[] testLengthOne = {1};
		int[] testLengthOneNF = {0};
		int[] testUnSorted = {2, 1, 3, 5, 4, 6, 7, 9};
		int[] testOneValue = {4, 4, 4, 4, 4, 4, 4, 4, 4};
		int[] testOneValue2 = {4, 4, 4, 4, 4, 4, 4, 4};
		int[] testOneValue3 = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
		int[] testOneValue4 = {4, 4, 4, 4};
		int[][] testList = {testBegin, testEvenMiddle, testOddMiddle, testEnd, 
							testNotFound, testLengthOne, testLengthOneNF, testUnSorted, 
							testOneValue, testOneValue2, testOneValue3, testOneValue4};
		for (int i = 0; i < testList.length; i++) {
			test = new FractalTester(testList[i]);
			System.out.println("Test " + i + ": " + test.returnFirstNonMatch() + "\tLength: " + testList[i].length);
		}
	}
	
	public static int mostRepeated(int[] list){
		int currentMaxCount = 1;
		int currentMaxElt = list[0];
		int count = 0;
		for (int i = 1; i < list.length; i++){
			if(list[i] == list[i]-1){
				count++;
			}else if(count > currentMaxCount){
				currentMaxCount = count;
				currentMaxElt = list[i-1];
				count = 1;
			}
		}
		if(currentMaxCount > 1){
			return currentMaxElt;
		}return -1;
	}

}
