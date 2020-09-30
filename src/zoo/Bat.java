package zoo;

public class Bat extends Mammal {
	public Bat(String name, int energyLvl, String type) {
		super(name, type, energyLvl);
		this.canFly = true;
		this.attack = true;
		this.eatHuman = true;
		this.throwSomething = false;
		this.eatBananas = false;
		this.climb = false;
		
	}
	public void fullDay(Bat bat) {
		System.out.println("************Full*******Day*************");
		System.out.println("***************************************");
		attack();
		fly();
		eatHuman();
		System.out.println("***************************************");
		bat.toString();
		System.out.println(bat);
	}
	
}
