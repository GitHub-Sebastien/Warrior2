package warrior2;

public class Gobelin extends Character{
	private final static int HEALTH = 15;
	private final static int STRENGTH = 8;
	

	public Gobelin() {
		super("Karascos", HEALTH,STRENGTH );
	}
	
	
	public String toString() {
	return getName() + " il posséde " + HEALTH + " de vie et " + STRENGTH + " d'attaque" ; 
	}


	@Override
	public void interactWithPlayer(Character player) {
		
		
		System.out.println("Voila " +getName() + " attention !!");
	}

}
