package warrior2;



public class Warrior extends Character {
	private final static int HEALTH = 5;
	private final static int HEALTH_MAX = 12;
	private final static int STRENGTH = 7;
	private final static int STRENGTH_MAX= 15;
	
	public Warrior() {
		super("Dante",HEALTH,STRENGTH);
	}
	public Warrior(String name) {
		super(name,HEALTH,STRENGTH);
	}
	public Warrior(String name,int health,int strength) {
		super(name,health,strength);
	}
	@Override
	public String toString() {
		return "Warrior : " +getName()+"\nPV : "+HEALTH+"\nATK : "+STRENGTH;
	}
	@Override
	void interactWithPlayer(Character player) {
		
	}

}
