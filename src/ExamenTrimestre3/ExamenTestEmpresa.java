package ExamenTrimestre3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExamenTestEmpresa {

	@Test
	public void testDatosBuenos1() {
		
		assertEquals(300, ExamenEmpresa.Separar("100;Diego Alvarez;01;SI"));
		
	}

	@Test
	public void testDatosBuenos2() {
		
		assertEquals(500, ExamenEmpresa.Separar("101;Alba Gomez;07;NO"));
		
	}
	
	@Test(expected = Exception.class)
	public void testCod000NoValido() {
		
		ExamenEmpresa.Separar("000;Jesus Garcia;10;SI");
		
	}
	
	@Test(expected = Exception.class)
	public void testCodDemasiadoLargo() {
		
		ExamenEmpresa.Separar("1001;Carmen Ruiz;09;NO");
		
	}
	
	@Test(expected = Exception.class)
	public void testCodNoValido() {
		
		ExamenEmpresa.Separar("abc;Sandra Lopez;02;SI");
		
	}
	
	@Test(expected = Exception.class)
	public void testNombreLargo() {
		
		ExamenEmpresa.Separar("123;Juan González Fernández;03;SI");
		
	}
	
	@Test(expected = Exception.class)
	public void testAntiguedadNegativa() {
		
		ExamenEmpresa.Separar("123;Carmen Ruiz;-1;SI");
		
	}
	
	@Test(expected = Exception.class)
	public void testAntiguedadLarga() {
		
		ExamenEmpresa.Separar("123;Carmen Ruiz;111;NO");
		
	}
	
	@Test(expected = Exception.class)
	public void testAntiguedadMal() {
		
		ExamenEmpresa.Separar("123;Carmen Ruiz;ab;NO");
		
	}
	
	@Test(expected = Exception.class)
	public void testPlusError() {
		
		ExamenEmpresa.Separar("123;Carmen Ruiz;08;*");
		
	}
	
	
}
