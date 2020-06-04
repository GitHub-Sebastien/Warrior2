package warrior2;

abstract class Weapons extends Cell{
	private int strength;
	private String name;

	
	public Weapons (int strength, String nom){
		this.strength = strength;
		this.name = nom ;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setForce(int strength) {
		this.strength = strength;
	}
	public String getName() {
		return name;
	}
	public void setNom(String name) {
		this.name = name;
	}
	
	public String toString() {
		return   this.getName()+" qui ajoute " +this.getStrength()+ " a votre attaque ! " ;
	}
}
