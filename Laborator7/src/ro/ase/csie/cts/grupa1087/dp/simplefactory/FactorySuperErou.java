package ro.ase.csie.cts.grupa1087.dp.simplefactory;

public class FactorySuperErou {
		
	public static SuperErouAbstract getSuperErou(TipErou tip,
			String nume) {
		SuperErouAbstract superErou= null;
		
		switch(tip) {
		case DISNEY:
			superErou = new CarcterDisney(nume, 100, false);
			break;
		case MARVEL:
			superErou= new CarcterMarvel(nume, 500, 0);
			break;
		case DC:
			superErou= new CaracterDCComics(nume,500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return superErou;
	}
}
