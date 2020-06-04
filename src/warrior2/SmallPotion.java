package warrior2;

public class SmallPotion extends Cell {
	private final int ADD_HEALTH = 8;
	
	public SmallPotion() {}
	
	
	public void interactWithPlayer(Character Player) {
		int newHealth;
		System.out.println("Je suis une petite potion");
		System.out.println(Player);
		System.out.println( "PV avant : " + Player.getHealth());
		newHealth = Player.getHealth() + ADD_HEALTH;
		System.out.println("PV après : " + newHealth);
		Player.setHealth(newHealth);
		System.out.println(Player.getHealth());
	}
	
	public String toString() {
		return "je suis une potion";
		
	}

}
