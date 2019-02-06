package rubixActions;


public interface ActionFace {
	public void setFace(FaceElement input);
	public void setRow(int row);
	public void setColumn(int column);
	public void setDirection();
	public void rotate(int row, int column, FaceElement face);
}
