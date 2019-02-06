package rubixActions;

import rubixCode.Color;
import rubixCode.Face;

public interface ActionFace <T>{
	public Face selectedFace(T input);
	public Color[] selectedRow(T input);
	public Color[] selectedColumn(T input);
	public Direction getDirection();
	public void rotate(Color[] selection, Direction direction);
}
