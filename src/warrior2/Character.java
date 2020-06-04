package warrior2;

 public abstract class Character extends Cell{
	private String name;
	private int health;
	private int strength;
	private int defense;
	

	public Character(String name, int health, int strength) {
		this.setName(name);
		this.setHealth(health);
		this.setStrength(strength);
	}
	public void setHealth(int health) {
		this.health = health; 
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void setDefense(int block) {
		defense = block;
	}
	public int getHealth() {
		return health;
	}
	public int getStrength() {
		return strength;
	}
	 
	public int getDefense() {
		return defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
			this.name = name;
	}

	public String toString() {
		
			return  "Votre pseudo : " + name;
	}
}
