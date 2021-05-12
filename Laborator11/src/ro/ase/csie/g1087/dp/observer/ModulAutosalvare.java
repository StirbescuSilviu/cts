package ro.ase.csie.g1087.dp.observer;

public class ModulAutosalvare implements InterfataStatusConexiune{

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Salvare automata joc");
	}

}
