package intArray;

import java.util.Arrays;

public class CommonInt {

	public static void main(String[] args) {
		int[] arrayOne = {1, 4, 3, 6, 2, 2, 7, 9, 4, 0, 5, 7};
		int[] arrayTwo = {5, 5, 6, 7, 3, 7, 2, 2, 8, 9, 0, 2, 2, 4};
		int[] testOneTwo = commonInt(arrayOne, arrayTwo);
		System.out.println(Arrays.toString(testOneTwo));
	}
	
	public static int[] commonInt(int[] A, int[] B) {
		int[] toReturn = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int size = 0;
		int[] testA = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] testB = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < A.length; i++) {
			testA[A[i]]++;
		}
		for (int i = 0; i < B.length; i++) {
			testB[B[i]]++;
		}
		for (int i = 0; i < 10; i++) {
			if ((testA[i] != 0) && (testB[i] != 0)) {
				toReturn[size] = i;
				size++;
			}
		}
		return toReturn;
	}

}
