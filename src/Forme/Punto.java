package Forme;

public class Punto implements Forma {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public void trasla(int deltaX, int deltaY) {
		this.x += deltaX;
		this.y += deltaY;
	}
	
	@Override
	public boolean equals(Object o) {
		final Punto that = (Punto) o;
		return that.getX() == this.getX() && that.getY() == this.getY();
	}
}