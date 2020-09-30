package zoo;

public class Mammal {

	public String name;
	private String type;
	public Integer energyLvl;
	public Boolean throwSomething;
	public Boolean eatBananas;
	public Boolean climb;
	public Boolean canFly;
	public Boolean attack;
	public Boolean eatHuman;

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
		output += "Type:      " + type + "\n";
		output += "Energy Lvl: " + energyLvl + "\n";
		output += "Can throw?:" + (throwSomething ? " yes " + "\n":  "no" + "\n");
		output += "Can climb:" + (climb ? " yes " + "\n":  "no" + "\n");
		output += "Eats Bananas: " + (eatBananas ? " yes " + "\n":  "no" + "\n");
		output += "fly:    		 " + ( canFly ? " yes " + "\n":  "no" + "\n");
		output += "Attack:    	 " + (attack ? " yes " + "\n":  "no" + "\n");
		output += "Eat Human:    " + (eatHuman ? " yes " + "\n":  "no" + "\n");
		return output;
	}

	
	public Boolean getFly() {
		return canFly;
	}

	public void setFly(Boolean canFly) {
		this.canFly = canFly;
	}
	public Boolean getAttack() {
		return attack;
	}

	public void setAttack(Boolean attack) {
		this.attack = attack;
	}
	public Boolean getEatHuman() {
		return eatHuman;
	}

	public void eatHuman(Boolean eatHuman) {
		this.eatHuman = eatHuman;
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
	public void attack() {
		if (getAttack() == true) {
			energyLvl += -10;
			System.out.println("************************" + "\n"+
				    			name + " Just attacked and lost 10 energy" + "\n" +
							   "************************");
		}

	}
	public void fly() {
		if (getFly() == true) {
			energyLvl += -10;
			System.out.println("************************" + "\n"+
				    			name + " Just flew and lost 10 energy" + "\n" +
							   "************************");
		}

	}
	public void eatHuman() {
		if (getEatHuman() == true) {
			energyLvl += 50;
			System.out.println("************************" + "\n"+
				    		   name + " Just ate a human and gained 50 energy" + "\n" +
				               "************************");
		}

	}

	public void throwSomething() {
		if (getThrowSomething() == true) {
			energyLvl += -10;
			System.out.println("************************" + "\n"+
							    name + " Just threw something and lost 10 energy" + "\n" +
							   "************************");
		}

	}

	public void eatBananas() {
		if (eatBananas == true) {
			energyLvl += 10;
			System.out.println("************************" + "\n"+
				    		    name + " Just ate a banana and gained 10 energy" + "\n" +
							   "************************");
		}
	}

	public void hasClimed() {
		if (climb == true)
			;
		energyLvl += -15;
		System.out.println("************************" + "\n"+
			    			name + " Just threw climed a tree and lost 15 energy" + "\n" +
						   "************************");
	}

	

}
