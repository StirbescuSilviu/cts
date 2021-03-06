package ro.ase.csie.g1087.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import com.sun.tools.javac.code.TypeTag.NumericClasses;

import ro.ase.csie.g1087.testare.exceptii.ExceptieNota;
import ro.ase.csie.g1087.testare.exceptii.ExceptieNume;
import ro.ase.csie.g1087.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.g1087.testare.modele.Student;

public class TestStudent {
	
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial= "Gigel";
	static int varstaInitiala= 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		note= new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(8);
		  
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		note.clear();
		note= null;
	}

	@Before
	public void setUp() throws Exception {
		  student = new Student(numeInitial,varstaInitiala,note);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVarstaValoriNormaleRight(){
	
		
		//int varstaNoua= 22;
		int varstaNoua=Student.MIN_VARSTA +1;
		student.setVarsta(varstaNoua);
		assertEquals("Testare cu valori ok",varstaNoua,student.getVarsta());
	}
	
	@Test
	public void testSetNumeRight() {
		String numeNou = "Ionel";
		try {
		student.setNume(numeNou);
		assertEquals("Test cu val corecte",numeNou , student.getNume());
		} catch (ExceptieNume e) {
			fail("Am primit exceptie pt val normale");
		}
	}
	
	@Test 
	public void testSetVarstaErrorConditionsValoriNegative() {
		int varstaNoua= -100;
		try {
		student.setVarsta(varstaNoua); 
		} catch (ExceptieVarsta e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void testSetVarstaErrorConditionsValoriMari() {
		int varstaNoua= Student.MAX_VARSTA+100;
		student.setVarsta(varstaNoua);
		
	}

	@Test 
	public void testGetNotaMinimaOrderingSortateCrescator() throws ExceptieNota {
		
		int notaMinima=4;
		ArrayList<Integer> noteSortate = new ArrayList<>();
		for(int i =0; i< 5;i++) {
			noteSortate.add(notaMinima+i);
		}
		student.setNote(noteSortate);
		int notaDeterminata = student.getNotaMinima();
		assertEquals("test note sortate crescator", notaMinima, notaDeterminata);
	}

	@Test
	public void testGetNotaMinimaCardinalityZero() throws ExceptieNota{
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		int notaMinima= 0;
		int notaMinimaCalcula= student.getNotaMinima();
		assertEquals("Test fara note", notaMinima,notaMinimaCalcula);
	}


}
