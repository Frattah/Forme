package Forme;

public class MainForme {
	static public void main(String[] argc) {
		Punto p0 = new Punto(0,0);
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(-3,2);
		Punto p3 = new Punto(-5,-5);
		Cerchio c0 = new Cerchio(p0, 1);
		Cerchio c1 = new Cerchio(p1, 2);
		Rettangolo r0 = new Rettangolo(p2, 3, 2);
		Rettangolo r1 = new Rettangolo(p3, 4, 2);
		GruppoDiForme gf0 = new GruppoDiForme(c0, c1);
		GruppoDiForme gf1 = new GruppoDiForme(r1, r0, gf0);
		System.out.println(gf1.toString());
	}
}
