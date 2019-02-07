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
		}else if(direction.equals(Direction.LEFT)){
			rotateLeft();
		}else {
//			rotateRight();
		}
		
	}
	
	private void rotateLeft() {
		Color head = cube.getSides().getEntry(0).getData().getFace()[currentRow][0];
		for(int i = 0; i < 4; i++) { // i = face entry in linkedList
			for (int j = 0; j < 3; j++) { // currentRow = row, j = index
				int faceDex = i;
				int index = j;
				if(i == 0) {
					j++;
				}
				if(j == 0) {
					faceDex = i - 1;
					index = 2;
				}
				cube.getSides().getEntry(faceDex).getData().getFace()[currentRow][index] = cube.getSides().getEntry(i).getData().getFace()[currentRow][j];
			}
		}
		cube.getSides().getEntry(3).getData().getFace()[currentRow][2] = head;
	}

}
