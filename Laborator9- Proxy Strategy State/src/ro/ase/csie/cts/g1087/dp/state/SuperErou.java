package ro.ase.csie.cts.g1087.dp.state;

public class SuperErou {

	public static final int NIVEL_CRITIC = 10;	
	
	int puncteViata;
	String nume;
	
	InterfataMiscare modMiscare = null;
	
	public SuperErou(int puncteViata, String nume) {
		super();
		this.puncteViata = puncteViata;
		this.nume = nume;
		this.modMiscare = new MiscareNormala();
	}

	void seDeplaseaza() {
		this.modMiscare.seDeplaseaza();
	}
	
	void esteAtacat(int puncte) {
		this.puncteViata-= puncte;
		if(this.puncteViata< NIVEL_CRITIC)
			this.modMiscare = new MiscareModRanit();
	}
	
	void seVindeca(int puncte) {
		this.puncteViata+=puncte;
		if(this.puncteViata> NIVEL_CRITIC)
			this.modMiscare = new MiscareNormala();
	}
}
