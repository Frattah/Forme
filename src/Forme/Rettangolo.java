package Forme;

public class Rettangolo implements Forma {
	
	private int base, altezza;
	private Punto vertice;
	
	public Rettangolo(Punto vertice, int altezza, int base) {
		this.altezza = altezza;
		this.base = base;
		this.vertice = new Punto(vertice.getX(), vertice.getY());
	}

	@Override
	public void trasla(int deltaX, int deltaY) {
		this.vertice.setX(this.vertice.getX() + deltaX);
		this.vertice.setY(this.vertice.getY() + deltaY);
	}
	
	public String toString() {
		return ("Rettangolo:\n----------\nvertice: (" + this.getVertice().getX() + "," + this.getVertice().getY() + 
				")\nbase:	  " + this.getBase() + "\naltezza:    " + this.getAltezza() + "\n");
	}
	
	@Override
	public boolean equals(Object o) {
		final Rettangolo that = (Rettangolo) o;
		return that.getVertice().equals(this.getVertice()) &&
			   that.getBase() == this.getBase() &&
			   that.getAltezza() == this.getAltezza();
	}
	
	public int getBase() { return base; }
	
	public int getAltezza() { return altezza; }
	
	public Punto getVertice() { return vertice; }
}
