package warrior2;

public class Mjolnir extends Weapons {
	
	private int strength = 25;
	private final int ADD_STRENGTH = 5 ;
	
	
	public Mjolnir() {
		 super(5,"Mjolnir");
	}
	
	
	public String toString() {
		
		return super.toString();
	}


	@Override
	public void interactWithPlayer(Character player) {
		int newStrength;
		System.out.println("Vous trouvez " + super.getName() + ", vous gagnez " + ADD_STRENGTH + " de force");
		System.out.println("Votre force avant " + player.getStrength());
		newStrength = player.getStrength() + ADD_STRENGTH;
		player.setStrength(newStrength);
		System.out.println("Votre force maintenant " + player.getStrength());
		
		
		
		
		
	}


}
