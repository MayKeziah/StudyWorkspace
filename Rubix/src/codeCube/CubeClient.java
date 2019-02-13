package codeCube;

import java.util.Arrays;

public class CubeClient {
	public static void main(String[] args) {
		Cube test = new Cube();
		Color[] print = test.getRubix();
		System.out.println(Arrays.toString(print));
	}

}
