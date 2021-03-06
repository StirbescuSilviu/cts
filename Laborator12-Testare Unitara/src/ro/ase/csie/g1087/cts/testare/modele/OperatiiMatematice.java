package ro.ase.csie.g1087.cts.testare.modele;

import ro.ase.csie.g1087.cts.testare.exceptii.ExceptieImpartireLaZero;

public class OperatiiMatematice {

	public static int aduna(int a, int b) {
		return a+b;
	}
	
	public static double impartire(int a, int b) throws ExceptieImpartireLaZero {
		if(b==0)
			throw new ExceptieImpartireLaZero();
		return a/b;
	}
}
