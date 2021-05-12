package ro.ase.csie.g1087.dp.observer;

public class TestObserver {

	public static void main(String[] args) {
		ModulConexiune modulConexiune= new ModulConexiune();
		
		ModulAutosalvare modulSalvare = new ModulAutosalvare();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		modulConexiune.pierdereConexiune();
		
		modulConexiune.registerModul(modulNotificari);
		modulConexiune.registerModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		
		modulConexiune.unregisterModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		}

}
