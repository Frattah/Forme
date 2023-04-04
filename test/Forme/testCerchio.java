package Forme;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testCerchio {
	Cerchio cerchioTest;
	
	private Cerchio cerchioUnitario() {
		cerchioTest = new Cerchio(new Punto(0,0),1);
		return cerchioTest;
	}
	
	private Cerchio cerchioCentratoPositiviRaggio1() {
		cerchioTest = new Cerchio(new Punto(3,2), 1);
		return cerchioTest;
	}
	
	private Cerchio cerchioCentratoNegativiRaggio2() {
		cerchioTest = new Cerchio(new Punto(-5,-1), 2);
		return cerchioTest;
	}
	
	private Cerchio cerchioCentratoGenericiRaggio4() {
		cerchioTest = new Cerchio(new Punto(12,-5), 4);
		return cerchioTest;
	}

	// trasla #############################################################################################################
	@Test
	public void testTraslaCerchioUnitarioDi_0_0() {
		this.cerchioUnitario().trasla(0, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(0,0) , 1));
	}
	
	@Test
	public void testTraslaCerchioUnitarioDi_0_1() {
		this.cerchioUnitario().trasla(0, 1);
		assertEquals(cerchioTest, new Cerchio(new Punto(0,1),1));
	}
	
	@Test
	public void testTraslaCerchioUnitarioDi_1_0() {
		this.cerchioUnitario().trasla(1, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(1,0),1));
	}
	
	@Test
	public void testTraslaCerchioUnitarioDiPositivi() {
		this.cerchioUnitario().trasla(3, 2);
		assertEquals(cerchioTest, new Cerchio(new Punto(3, 2), 1));
	}
	
	@Test
	public void testTraslaCerchioUnitarioDiNegativi() {
		this.cerchioUnitario().trasla(-3, -5);
		assertEquals(cerchioTest, new Cerchio(new Punto(-3,-5), 1));
	}
	
	@Test
	public void testTraslaCerchioUnitarioDiGenerici() {
		this.cerchioUnitario().trasla(5, -12);
		assertEquals(cerchioTest, new Cerchio(new Punto(5, -12),1));
	}
	
	
	// CERCHIO CENTRATO POSITIVI RAGGIO 2 ###############################################################################################################
	
	
	@Test
	public void testTraslaCerchioCentratoPositiviRaggio1Di_0_0() {
		this.cerchioCentratoPositiviRaggio1().trasla(0, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(3,2),1));
	}
	
	@Test
	public void testTraslaCerchioCentratoPositiviRaggio1Di_1_0() {
		this.cerchioCentratoPositiviRaggio1().trasla(0, 1);
		assertEquals(cerchioTest, new Cerchio(new Punto(3,3),1));
	}
	
	@Test
	public void testTraslaCerchioCentratoPositiviRaggio1Di_0_1() {
		this.cerchioCentratoPositiviRaggio1().trasla(1, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(4,2),1));
	}
	
	@Test
	public void testTraslaCerchioCentratoPositiviRaggio1DiPositivi() {
		this.cerchioCentratoPositiviRaggio1().trasla(5, 6);
		assertEquals(cerchioTest, new Cerchio(new Punto(8,8),1));
	}
	
	@Test
	public void testTraslaCerchioCentratoPositiviRaggio1DiNegativi() {
		this.cerchioCentratoPositiviRaggio1().trasla(-3, -4);
		assertEquals(cerchioTest, new Cerchio(new Punto(0,-2),1));
	}
	
	@Test
	public void testTraslaCerchioCentratoPositiviRaggio1DiGenerici() {
		this.cerchioCentratoPositiviRaggio1().trasla(-9, 3);
		assertEquals(cerchioTest, new Cerchio(new Punto(-6,5),1));
	}
	
	
	// CERCHIO CENTRATO NEGATIVI RAGGIO 1 ###############################################################################################################
	
	
	@Test
	public void testTraslaCerchioCentratoNegativiRaggio2Di_0_0() {
		this.cerchioCentratoNegativiRaggio2().trasla(0, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(-5,-1),2));
	}
	
	@Test
	public void testTraslaCerchioCentratoNegativiRaggio2Di_0_1() {
		this.cerchioCentratoNegativiRaggio2().trasla(0, 1);
		assertEquals(cerchioTest, new Cerchio(new Punto(-5,0),2));
	}	
	
	@Test
	public void testTraslaCerchioCentratoNegativiRaggio2Di_1_0() {
		this.cerchioCentratoNegativiRaggio2().trasla(1, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(-4,-1),2));
	}	
	
	@Test
	public void testTraslaCerchioCentratoNegativiRaggio2DiPositivi() {
		this.cerchioCentratoNegativiRaggio2().trasla(2, 1);
		assertEquals(cerchioTest, new Cerchio(new Punto(-3,0),2));
	}	
	
	@Test
	public void testTraslaCerchioCentratoNegativiRaggio2DiNegativi() {
		this.cerchioCentratoNegativiRaggio2().trasla(-3, -3);
		assertEquals(cerchioTest, new Cerchio(new Punto(-8,-4),2));
	}	
	
	@Test
	public void testTraslaCerchioCentratoNegativiRaggio2DiGenerici() {
		this.cerchioCentratoNegativiRaggio2().trasla(4, -10);
		assertEquals(cerchioTest, new Cerchio(new Punto(-1,-11),2));
	}
	
	
	// CERCHIO CENTRATO GENERICI RAGGIO 4 ###############################################################################################################

	
	@Test
	public void testTraslaCerchioCentratoGenericiRaggio4Di_0_0() {
		this.cerchioCentratoGenericiRaggio4().trasla(0, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(12,-5),4));
	}
	
	@Test
	public void testTraslaCerchioCentratoGenericiRaggio4Di_0_1() {
		this.cerchioCentratoGenericiRaggio4().trasla(0, 1);
		assertEquals(cerchioTest, new Cerchio(new Punto(12,-4),4));
	}
	
	@Test
	public void testTraslaCerchioCentratoGenericiRaggio4Di_1_0() {
		this.cerchioCentratoGenericiRaggio4().trasla(1, 0);
		assertEquals(cerchioTest, new Cerchio(new Punto(13,-5),4));
	}
	
	@Test
	public void testTraslaCerchioCentratoGenericiRaggio4DiPositivi() {
		this.cerchioCentratoGenericiRaggio4().trasla(5, 3);
		assertEquals(cerchioTest, new Cerchio(new Punto(17,-2),4));
	}
	
	@Test
	public void testTraslaCerchioCentratoGenericiRaggio4DiNegativi() {
		this.cerchioCentratoGenericiRaggio4().trasla(-2, -3);
		assertEquals(cerchioTest, new Cerchio(new Punto(10,-8),4));
	}
	
	@Test
	public void testTraslaCerchioCentratoGenericiRaggio4DiGenerici() {
		this.cerchioCentratoGenericiRaggio4().trasla(-3, 2);
		assertEquals(cerchioTest, new Cerchio(new Punto(9,-3),4));
	}
}
