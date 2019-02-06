package rubixActions;

import java.util.Scanner;

import rubixCode.Color;
import rubixCode.Cube;
import rubixCode.Face;

public class RubixAction implements ActionFace {
	private Cube cube;
	private int currentRow;
	private int currentColumn;
	private FaceElement currentFace;
	private Direction direction;
	private Scanner key = new Scanner(System.in);

	public RubixAction(Cube cube) {
		setCube(cube);
		setFace(FaceElement.TOP);
		setRow(0);
		setColumn(0);
	}
	
	public void setCube(Cube cube) {
		this.cube = cube;
	}
	@Override
	public void setFace(FaceElement input) {
		currentFace = input;
	}

	@Override
	public void setRow(int row) {
		currentRow = row;
	}

	@Override
	public void setColumn(int column) {
		currentColumn = column;
	}

	@Override
	public void setDirection() {
		System.out.print("Set direction (U, D, R, L): ");
		String directionChar = key.next();
		if(directionChar.equals("U")) {
			direction = Direction.UP;
		}else if(directionChar.equals("D")) {
			direction = Direction.DOWN;
		}else if(directionChar.equals("R")) {
			direction = Direction.RIGHT;
		}else {
			direction = Direction.LEFT;
		}
	}

	@Override
	public void rotate(int row, int column, FaceElement face) {
		setDirection();
		setRow(row);
		setColumn(column);
		setFace(face);
		rotate();
	}
	
	public void rotate() {
		if(currentFace.equals(FaceElement.TOP)) {
			//TODO:
		}else if(currentFace.equals(FaceElement.BASE)) {
			//TODO:
		}else if(direction.equals(Direction.UP)) {
			
		}
		
	}

}
