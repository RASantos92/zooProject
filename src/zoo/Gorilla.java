package zoo;

public class Gorilla extends Mammal {
	public Gorilla(String name, int energyLvl, String type) {
		super(name, type, energyLvl);
		this.throwSomething = true;
		this.eatBananas = true;
		this.climb = true;

	}

}