package zoo;

public class Gorilla extends Mammal {
	public Gorilla(String name, int energyLvl, String type) {
		super(name, type, energyLvl);
		this.canFly = false;
		this.attack = false;
		this.eatHuman = false;
		this.throwSomething = true;
		this.eatBananas = true;
		this.climb = true;

	}
	public void fullDay() {
		System.out.println("************Full*******Day*************");
		System.out.println("***************************************");
		throwSomething();
		eatBananas();
		hasClimed();
		System.out.println("***************************************");
	}

}