package game.viewer;

public class ButtonDataStorage {
	
	public int X;
	public int Y;
	public int Width;
	public int Height;
	
	ButtonDataStorage(int x,int y,int width, int height){
		X = x;
		Y = y;
		Width = width;
		Height = height;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public int getWidth() {
		return Width;
	}
	public int getHeight() {
		return Height;
	}
	
	public void setX(int x) {
		X = x;
	}
	public void setY(int y) {
		Y = y;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public void setHeight(int height) {
		Height = height;
	}
}
