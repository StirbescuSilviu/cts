package ro.ase.csie.cts.g1087.dp.prototype;

import java.util.Random;

public class Model3DCaracter implements Cloneable {
	
	String culoare;
	int inaltime;
	
	ArrayList<Integer> puncte = new ArrayList<Integer>();
	
	public Model3DCaracter(String culoare) {
		this.culoare = culoare;
		
		System.out.println("Incarcare model 3d din fisier ....");
			try {
				Thread.sleep(2000);
				Random random = new Random(10);
				for(int i=0; i<20; i++) {
					this.puncte.add(random.nextInt(1000));
				}
				System.out.println("Model 3d generat");
			}
	}
	
	private Model3dCaracter() {
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
	//Model3dCaracter copie = new Model3dCaracter(this.culoare);
		Model3dCaracter copie = new Model3dCaracter();
		copie.culoare= this.culoare;
		copie.inaltime= this.inaltime;
		copie.puncte=  (ArrayList<Integer>) this.puncte.clone();
	}
	
}
