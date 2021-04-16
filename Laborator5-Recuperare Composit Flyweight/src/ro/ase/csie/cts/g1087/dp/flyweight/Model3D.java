package ro.ase.csie.cts.g1087.dp.flyweight;

import java.util.ArrayList;

//asta este flyweight-ul nostru
public class Model3D implements InterfataModel3D {
	
	String descriere;
	ArrayList<Integer> puncteModel = new ArrayList<>();
	
	@Override
	public void incarcaModel3d(String fisier) {
		System.out.println(String.format("Incarcare model pentru %s din"
				+ " fisierul %s", descriere,fisier));
		for(int i=0; i<10; i++) {
			puncteModel.add(i);
		}
	}

	@Override
	public void afisareEcran(ContextEcran context) {
		System.out.println(String.format("afisare %s la %d, %d cu textura"
				+ "%s",descriere, context.getX(),
				context.getY(),context.getCuloareTextura()));
	}

	public Model3D(String descriere) {
		super();
		this.descriere = descriere;
	}
	
}
