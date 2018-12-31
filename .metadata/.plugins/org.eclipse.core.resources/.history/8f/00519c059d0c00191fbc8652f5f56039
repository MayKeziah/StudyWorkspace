package charArray;

import java.util.Arrays;

public class ReverseCharArray {

	public static void main(String[] args) {
		char[] myEvenArray = {'a', 'b', 'c', 'd'};
		reverse(myEvenArray);
		System.out.println(Arrays.toString(myEvenArray));
		char[] myOddArray = {'a', 'b', 'c', 'd', 'e'};
		reverse(myOddArray);
		System.out.println(Arrays.toString(myOddArray));
		char[] myIntArray = {1, 2, 3, 4};
		reverse(myIntArray);
		System.out.println(Arrays.toString(myIntArray));
		char[] mySymbolArray = {'@', '#', '$', '%'};
		reverse(mySymbolArray);
		System.out.println(Arrays.toString(mySymbolArray));
	}
	
	public static void reverse(char[] myList) {
		int length = myList.length;
		char tempElement;
		for (int i = 0; i <= (length/2); i++) {
			tempElement = myList[i];
			myList[i] = myList[length-i-1];
			myList[length-i-1] = tempElement;
		}
		
	}

}
