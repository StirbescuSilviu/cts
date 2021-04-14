package ro.ase.csie.cts.g1087.dp.adapter;

import java.util.ArrayList;

public class TestAdapterJava {

	public static void main(String[] args) {
		CaracterFantastic dragon= new CaracterFantastic("Drag albastru",1000);
		dragon.seDeplaseza();
		dragon.esteLovit(200);
		//dragon.seVindeca(100);
		
		DonaldDuck donald= new DonaldDuck();
		donald.setPower(500);
		donald.move(100,100);
		donald.primesteLovitura(50);
		donald.reincarca(50);
		
		ArrayList<ACMECaracterJoc> caractere = nre ArrayList<>();
		caractere.add(dragon);
		
	}

}
