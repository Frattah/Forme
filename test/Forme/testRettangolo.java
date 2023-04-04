package Forme;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testRettangolo {
	Rettangolo rettangoloTest;
	
	private Rettangolo rettangoloUnitario() {
		rettangoloTest = new Rettangolo(new Punto(0,0),1,1);
		return rettangoloTest;
	}
	
	private Rettangolo rettangoloCentratoPositiviAltezza2Base3() {
		rettangoloTest = new Rettangolo(new Punto(3,2),2,3);
		return rettangoloTest;
	}
	
	private Rettangolo rettangoloCentratoNegativiAltezza4Base5() {
		rettangoloTest = new Rettangolo(new Punto(-5,-1),4,5);
		return rettangoloTest;
	}
	
	private Rettangolo rettangoloCentratoGenericiAltezza3Base6() {
		rettangoloTest = new Rettangolo(new Punto(12,-5),3,6);
		return rettangoloTest;
	}
	
	// trasla #########################################################################################################################################
	@Test
	public void testTraslaRettangoloUnitarioDi_0_0() {
		rettangoloUnitario().trasla(0,0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(0,0),1,1));
	}
	
	@Test
	public void testTraslaRettangoloUnitarioDi_0_1() {
		rettangoloUnitario().trasla(0,1);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(0,1),1,1));
	}
	
	@Test
	public void testTraslaRettangoloUnitarioDi_1_0() {
		rettangoloUnitario().trasla(1,0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(1,0),1,1));
	}
	
	@Test
	public void testTraslaRettangoloUnitarioDiPositivi() {
		rettangoloUnitario().trasla(3,4);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(3,4),1,1));
	}
	
	@Test
	public void testTraslaRettangoloUnitarioDiNegativi() {
		rettangoloUnitario().trasla(-2,-4);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(-2,-4),1,1));
	}
	
	@Test
	public void testTraslaRettangoloUnitarioDiGenerici() {
		rettangoloUnitario().trasla(9,-3);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(9,-3),1,1));
	}
	
	
	// RETTANGOLO CENTRATO POSITIVI ALTEZZA 2 BASE 3 ########################################################################################################
	
	@Test
	public void testTraslaRettangoloCentratoPositiviAltezza2Base3Di_0_0() {
		rettangoloCentratoPositiviAltezza2Base3().trasla(0,0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(3,2),2,3));
	}
	
	@Test
	public void testTraslaRettangoloCentratoPositiviAltezza2Base3Di_0_1() {
		rettangoloCentratoPositiviAltezza2Base3().trasla(0,1);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(3,3),2,3));
	}
	
	@Test
	public void testTraslaRettangoloCentratoPositiviAltezza2Base3Di_1_0() {
		rettangoloCentratoPositiviAltezza2Base3().trasla(1,0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(4,2),2,3));
	}
	
	@Test
	public void testTraslaRettangoloCentratoPositiviAltezza2Base3DiPositivi() {
		rettangoloCentratoPositiviAltezza2Base3().trasla(5,3);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(8,5),2,3));
	}
	
	@Test
	public void testTraslaRettangoloCentratoPositiviAltezza2Base3DiNegativi() {
		rettangoloCentratoPositiviAltezza2Base3().trasla(-2,-3);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(1,-1),2,3));
	}
	
	@Test
	public void testTraslaRettangoloCentratoPositiviAltezza2Base3DiGenerici() {
		rettangoloCentratoPositiviAltezza2Base3().trasla(9,-9);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(12,-7),2,3));
	}
	
	// RETTANGOLO CENTRATO NEGATIVI ALTEZZA 4 BASE 5 ####################################################################################
	@Test
	public void testTraslaRettangoloCentratoNegativiAltezza4Base5Di_0_0() {
		rettangoloCentratoNegativiAltezza4Base5().trasla(0,0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(-5,-1),4,5));
	}
	
	@Test
	public void testTraslaRettangoloCentratoNegativiAltezza4Base5Di_0_1() {
		rettangoloCentratoNegativiAltezza4Base5().trasla(0,1);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(-5,0),4,5));
	}
	
	@Test
	public void testTraslaRettangoloCentratoNegativiAltezza4Base5Di_1_0() {
		rettangoloCentratoNegativiAltezza4Base5().trasla(1,0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(-4,-1),4,5));
	}
	
	@Test
	public void testTraslaRettangoloCentratoNegativiAltezza4Base5DiPositivi() {
		rettangoloCentratoNegativiAltezza4Base5().trasla(1,3);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(-4,2),4,5));
	}
	
	@Test
	public void testTraslaRettangoloCentratoNegativiAltezza4Base5DiNegativi() {
		rettangoloCentratoNegativiAltezza4Base5().trasla(-2,-3);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(-7,-4),4,5));
	}
	
	@Test
	public void testTraslaRettangoloCentratoNegativiAltezza4Base5DiGenerici() {
		rettangoloCentratoNegativiAltezza4Base5().trasla(9,-9);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(4,-10),4,5));
	}
	
	// RETTANGOLO CENTRATO GENERICI ALTEZZA 3 BASE 6 ####################################################################################
	@Test
	public void testTraslaRettangoloCentratoGenericiAltezza3Base6Di_0_0() {
		rettangoloCentratoGenericiAltezza3Base6().trasla(0, 0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(12,-5),3,6));
	}
	
	@Test
	public void testTraslaRettangoloCentratoGenericiAltezza3Base6Di_0_1() {
		rettangoloCentratoGenericiAltezza3Base6().trasla(0, 1);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(12,-4),3,6));
	}

	@Test
	public void testTraslaRettangoloCentratoGenericiAltezza3Base6Di_1_0() {
		rettangoloCentratoGenericiAltezza3Base6().trasla(1, 0);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(13,-5),3,6));
	}
	
	@Test
	public void testTraslaRettangoloCentratoGenericiAltezza3Base6DiPositivi() {
		rettangoloCentratoGenericiAltezza3Base6().trasla(3, 2);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(15,-3),3,6));
	}
	
	@Test
	public void testTraslaRettangoloCentratoGenericiAltezza3Base6DiNegativi() {
		rettangoloCentratoGenericiAltezza3Base6().trasla(-4, -5);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(8,-10),3,6));
	}
	
	@Test
	public void testTraslaRettangoloCentratoGenericiAltezza3Base6DiGenerici() {
		rettangoloCentratoGenericiAltezza3Base6().trasla(-6, 4);
		assertEquals(rettangoloTest, new Rettangolo(new Punto(6,-1),3,6));
	}
}
