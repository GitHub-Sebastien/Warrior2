package warrior2;

public class Magician extends Character {
	
	private final static int HEALTH = 3;
	private final static int HEALTH_MAX = 6;
	private final static int STRENGTH = 8;
	private final static int  STRENGTH_MAX= 15;
	
	public Magician() {
		this("toto",HEALTH,STRENGTH);
	}
	public Magician(String name) {
		super(name,HEALTH,STRENGTH);
	}
	public Magician(String name,int health,int strength) {
		super(name,health,strength);
	}
	
	@Override
	public String toString() {
		return "Magician : " +getName()+"\nPV : "+HEALTH+"\nATK :"+STRENGTH+ "\n";
	}
	@Override
	public void interactWithPlayer(Character player) {
		// TODO Auto-generated method stub
		
	}

}
