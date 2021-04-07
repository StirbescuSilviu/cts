package ro.ase.csie.cts.grupa1087.dp.simplefactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
//		SuperErouAbstract supererou=
//				new CaracterDisney("Mickey Mouse,100,false");
//		
//		supererou= new CaracterMarvel("Spiderman",150,50);
//		supererou= new CarcaterDCComics("Batman",150);
//		
		SuperErouAbstract superCarcter=
				FactorySuperErou.getSuperErou(TipErou.DISNEY,
						"Mickey Mouse");
		
		superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
	}

}
