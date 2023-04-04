package Forme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class testGruppoDiForme {
	private GruppoDiForme gruppoVuoto;
	
	@BeforeEach
	public void SetUp() {
		gruppoVuoto = new GruppoDiForme();
	}
	
	private GruppoDiForme gruppoSemplice() {
		Cerchio c = new Cerchio(new Punto(0,0), 1);
		gruppoVuoto.aggiungiForma(c);
		return gruppoVuoto;
	}
	
	private GruppoDiForme gruppoComposito() {
		Cerchio c0 = new Cerchio(new Punto(0,1), 2);
		Rettangolo r = new Rettangolo(new Punto(-2,1), 3, 2);
		Cerchio c1 = new Cerchio(new Punto(-2,3), 3);
		GruppoDiForme gf = new GruppoDiForme(c1);
		gruppoVuoto.aggiungiForma(c0);
		gruppoVuoto.aggiungiForma(r);
		gruppoVuoto.aggiungiForma(gf);
		return gruppoVuoto;
	}
	
	// trasla ################################################################################################################
	
	@Test
	void testTraslaGruppoVuotoDi_0_0() {
		this.gruppoVuoto.trasla(0, 0);
		assertEquals(new GruppoDiForme(), gruppoVuoto, "Il gruppo di forme vuoto sembra essere stato traslato");
	}
	
	@Test
	void testTraslaGruppoVuotoDi_0_1() {
		this.gruppoVuoto.trasla(0, 1);
		assertEquals(new GruppoDiForme(), gruppoVuoto, "Il gruppo di forme vuoto sembra essere stato traslato");
	}
	
	@Test
	void testTraslaGruppoVuotoDi_1_0() {
		this.gruppoVuoto.trasla(1, 0);
		assertEquals(new GruppoDiForme(), gruppoVuoto, "Il gruppo di forme vuoto sembra essere stato traslato");
	}
	
	@Test
	void testTraslaGruppoVuotoDiPositivi() {
		this.gruppoVuoto.trasla(3, 11);
		assertEquals(new GruppoDiForme(), gruppoVuoto, "Il gruppo di forme vuoto sembra essere stato traslato");
	}
	
	@Test
	void testTraslaGruppoVuotoDiNegativi() {
		this.gruppoVuoto.trasla(-2, -4);
		assertEquals(new GruppoDiForme(), gruppoVuoto, "Il gruppo di forme vuoto sembra essere stato traslato");
	}
	
	@Test
	void testTraslaGruppoVuotoDiGenerici() {
		this.gruppoVuoto.trasla(3, 5);
		assertEquals(new GruppoDiForme(), gruppoVuoto, "Il gruppo di forme vuoto sembra essere stato traslato");
	}
	

	
	// GRUPPO SEMPLICE #######################################################################################################################
	
	

	@Test
	void testTraslaGruppoSempliceDi_0_0() {
		GruppoDiForme gruppoSemplice = gruppoSemplice();
		gruppoSemplice.trasla(0, 0);
		assertEquals(new GruppoDiForme(), gruppoSemplice, "Il gruppo di forme sembra essere stato traslato di un delta nullo");
	}
	
	@Test
	void testTraslaGruppoSempliceDi_0_1() {
		GruppoDiForme gruppoSemplice = gruppoSemplice();
		gruppoSemplice.trasla(0, 1);
		assertEquals(new GruppoDiForme(new Cerchio(new Punto(0, 1), 1)), gruppoSemplice, "Il gruppo di forme sembra essere stato traslato di un delta nullo");
	}
	
	@Test
	void testTraslaGruppoSempliceDi_1_0() {
		GruppoDiForme gruppoSemplice = gruppoSemplice();
		gruppoSemplice.trasla(1, 0);
		assertEquals(new GruppoDiForme(new Cerchio(new Punto(1, 0), 1)), gruppoSemplice, "Il gruppo di forme sembra essere stato traslato di un delta nullo");
	}
	
	@Test
	void testTraslaGruppoSempliceDiPositivi() {
		GruppoDiForme gruppoSemplice = gruppoSemplice();
		gruppoSemplice.trasla(3, 4);
		assertEquals(new GruppoDiForme(new Cerchio(new Punto(3, 4), 1)), gruppoSemplice, "Il gruppo di forme sembra essere stato traslato di un delta nullo");
	}
	
	@Test
	void testTraslaGruppoSempliceDiNegativi() {
		GruppoDiForme gruppoSemplice = gruppoSemplice();
		gruppoSemplice.trasla(-3, -2);
		assertEquals(new GruppoDiForme(new Cerchio(new Punto(-3, -2), 1)), gruppoSemplice, "Il gruppo di forme sembra essere stato traslato di un delta nullo");
	}
	
	@Test
	void testTraslaGruppoSempliceDiGenerici() {
		GruppoDiForme gruppoSemplice = gruppoSemplice();
		gruppoSemplice.trasla(4, -7);
		assertEquals(new GruppoDiForme(new Cerchio(new Punto(4, -7), 1)), gruppoSemplice, "Il gruppo di forme sembra essere stato traslato di un delta nullo");
	}

	
	
	// GRUPPO COMPOSITO #######################################################################################################################

	
	
	@Test
	void testTraslaGruppoCompositoDi_0_0() {
		GruppoDiForme gruppoComposito = gruppoComposito();
		gruppoComposito.trasla(0,0);
		assertEquals(new GruppoDiForme(new GruppoDiForme(new Cerchio(new Punto(-2,3), 3)), new Rettangolo(new Punto(-2,1), 3, 2), 
					 new Cerchio(new Punto(0,1), 2)), gruppoComposito, "Per valori nulli il gruppo viene traslato");
	}
	
	@Test
	void testTraslaGruppoCompositoDi_0_1() {
		GruppoDiForme gruppoComposito = gruppoComposito();
		gruppoComposito.trasla(0,1);
		assertEquals(new GruppoDiForme(new GruppoDiForme(new Cerchio(new Punto(-2,4), 3)), new Rettangolo(new Punto(-2,2), 3, 2), 
					 new Cerchio(new Punto(0,2), 2)), gruppoComposito, "Per valori nulli il gruppo viene traslato");
	}
	
	@Test
	void testTraslaGruppoCompositoDi_1_0() {
		GruppoDiForme gruppoComposito = gruppoComposito();
		gruppoComposito.trasla(1,0);
		assertEquals(new GruppoDiForme(new GruppoDiForme(new Cerchio(new Punto(-1,3), 3)), new Rettangolo(new Punto(-1,1), 3, 2), 
					 new Cerchio(new Punto(1,1), 2)), gruppoComposito, "Per valori nulli il gruppo viene traslato");
	}
	
	@Test
	void testTraslaGruppoCompositoDiPositivi() {
		GruppoDiForme gruppoComposito = gruppoComposito();
		gruppoComposito.trasla(22,12);
		assertEquals(new GruppoDiForme(new GruppoDiForme(new Cerchio(new Punto(20,15), 3)), new Rettangolo(new Punto(20,13), 3, 2), 
					 new Cerchio(new Punto(22,13), 2)), gruppoComposito, "Per valori positivi il gruppo viene traslato");
	}
	
	@Test
	void testTraslaGruppoCompositoDiNegativi() {
		GruppoDiForme gruppoComposito = gruppoComposito();
		gruppoComposito.trasla(-5,-4);
		assertEquals(new GruppoDiForme(new GruppoDiForme(new Cerchio(new Punto(-7,-1), 3)), new Rettangolo(new Punto(-7,-3), 3, 2), 
					 new Cerchio(new Punto(-5,-3), 2)), gruppoComposito, "Per numeri negativi il gruppo viene traslato male");
	}

	@Test
	void testTraslaGruppoCompositoDiGenerici() {
		GruppoDiForme gruppoComposito = gruppoComposito();
		gruppoComposito.trasla(0,0);
		assertEquals(new GruppoDiForme(new GruppoDiForme(new Cerchio(new Punto(-2,3), 3)), new Rettangolo(new Punto(-2,1), 3, 2), 
					 new Cerchio(new Punto(0,1), 2)), gruppoComposito, "Per valori nulli il gruppo viene traslato");
	}
}
