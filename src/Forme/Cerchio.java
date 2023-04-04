package Forme;

public class Cerchio implements Forma {
	private int raggio;
	private Punto centro;
	
	public Cerchio(Punto centro, int raggio) {
		this.raggio = raggio;
		this.centro = new Punto(centro.getX(), centro.getY());
	}
	
	@Override
	public void trasla(int deltaX, int deltaY) {
		this.centro.setX(this.centro.getX() + deltaX);
		this.centro.setY(this.centro.getY() + deltaY);
	}
	
	@Override
	public boolean equals(Object o) {
		final Cerchio that = (Cerchio) o;
		return that.getCentro().equals(this.getCentro()) &&
			   that.getRaggio() == this.getRaggio();
	}
	
	public String toString() {
		return ("Cerchio:\n--------\ncentro: (" + this.getCentro().getX() + "," + this.getCentro().getY() + ")\nraggio:	  " + this.getRaggio() + "\n");
	}
	
	public Punto getCentro() { return this.centro; }
	
	public int getRaggio() { return this.raggio; }
}
