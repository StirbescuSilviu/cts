package ro.ase.csie.g1087.cts.testare.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.g1087.cts.testare.exceptii.ExceptieImpartireLaZero;
import ro.ase.csie.g1087.cts.testare.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("salut");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("la revedere");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("pregatire test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("stergere resurse folosite");
	}

	@Test
	public void test() {
		//System.out.println("test de test");
		fail("Not yet implemented");
	}

	@Test
	public void testAdunaValoriPozitive() {
		//System.out.println("test aduna");
		int a=5;
		int b = 5;
		int rezultatAsteptat=10;
		int rezultatCalculat=OperatiiMatematice.aduna(a, b);
		
		assertEquals("Suma cu nr pozitive",rezultatAsteptat, rezultatCalculat);
	}
	
	@Test
	public void testImpartireValoriPozitive() throws ExceptieImpartireLaZero {
		int a =1;
		int b=2;
		double rezultatAsteptat = 0.5;
		
		double rezultatCalculat=0;
		try {
			rezultatCalculat = OperatiiMatematice.impartire(a, b);
		} catch (ExceptieImpartireLaZero e) {
			fail("Am primit exceptia desi nu trebuia");
		}
		
		assertEquals("impartire 1/2", rezultatAsteptat,rezultatCalculat,0);
	}
}
