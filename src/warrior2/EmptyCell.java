package warrior2;

public  class EmptyCell extends Cell {
	
	public EmptyCell() {}

	@Override
	public void interactWithPlayer(Character player) {
		System.out.println("Case vide");
		
	}

}
