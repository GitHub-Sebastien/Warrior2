package warrior2;

public class Excalibur extends Weapons {
	
	
	
	public Excalibur() {
		 super(7,"Excalibur");
	}
	
	public String toString() {
		
		return super.toString();
	}

	@Override
	 public void interactWithPlayer(Character player) {
		System.out.println("Vous trouvez " +super.getName());
		
	}
}
