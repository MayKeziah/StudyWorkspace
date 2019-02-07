package rubixCode;

import rubixActions.Direction;
import rubixActions.FaceElement;
import rubixActions.RubixAction;

public class rubixCodeClient {
	public static void main(String[] args) {
//		Face test = new Face(Color.GREEN);
//		System.out.println("" + test + test.isSolid());
		Cube test2 = new Cube();
		test2.print();
		RubixAction cube = new RubixAction(test2);
		cube.rotate(1, 0, FaceElement.FOUR);
		test2.print();
	}

}
