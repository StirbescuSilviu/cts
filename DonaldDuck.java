package ro.ase.csie.cts.g1087.dp.adapter;

public class DonaldDuck implements ActiuniDisney {

		public static final String denumire="DONALD DUCK";
		int power;
	@Override
	public void move(int x, int y) {
	System.out.println("repozitionare caracter la noile coordonate");
		
	}

	@Override
	public void primesteLovitura(int power) {
		this.power-=power;
		System.out.println("nivel putere scade la "+ this.power);
		
	}

	@Override
	public void reincarca(int power) {
		this.power+=power;
		System.out.println("nivel putere reincarcat la "+ this.power);
		
	}

	@Override
	public void jump() {
		System.out.println("Jump");
		
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public static String getDenumire() {
		return denumire;
	}

}
