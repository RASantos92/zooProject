package zoo;

public class Mammal {

	public String name;
	private String type;
	public Integer energyLvl;
	protected Boolean throwSomething;
	protected Boolean eatBananas;
	protected Boolean climb;

	public Mammal(String name, String type, int energyLvl) {
		this.name = name;
		this.type = type;
		this.energyLvl = energyLvl;

	}

	public Mammal() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;

	}

	public void setType(String type) {
		this.type = type; // 1
	}

	public Integer getEngy() {
		return energyLvl;
	}

	public void setEngy(int energyLvl) {
		this.energyLvl = energyLvl; // 1
	}

	public String toString() {
		String output = "";
		output += "Name:       " + name + "\n";
		output += " type:      " + type + "\n";
		output += "Energy Lvl: " + energyLvl + "\n";
		output += "Can throw:  " + throwSomething + "\n";
		output += "Eats Bananas: " + eatBananas + "\n";
		output += "Can Climb:    " + climb;
		return output;
	}

	public Boolean getThrowSomething() {
		return throwSomething;
	}

	public void setThrowSomething(Boolean throwSomething) {
		this.throwSomething = throwSomething;
	}

	public Boolean getEatBananas() {
		return eatBananas;
	}

	public void setEatBananas(Boolean eatBananas) {
		this.eatBananas = eatBananas;
	}

	public Boolean getClimb() {
		return climb;
	}

	public void setClimb(Boolean climb) {
		this.climb = climb;
	}

	public void throwSomething() {
		if (getThrowSomething() == true) {
			energyLvl += -10;
			System.out.println(name + " Just threw some shit! ");
		}

	}

	public void eatBananas() {
		if (eatBananas == true) {
			energyLvl += 10;
			System.out.println(name + " Just ate a banana, gained: 10 health");
		}
	}

	public void hasClimed() {
		if (climb == true)
			;
		energyLvl += -15;
		System.out.println(name + " Climed a tree and lost 15 energy");
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
