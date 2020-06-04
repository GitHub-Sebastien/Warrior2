package warrior2;

public abstract class Cell {
	
	public Cell() {}
	
	abstract void interactWithPlayer(Character player);
	
	public String toString() {
		return "je suis une case ";
	}
	
}
