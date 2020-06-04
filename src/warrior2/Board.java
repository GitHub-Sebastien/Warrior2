package warrior2;

import java.util.ArrayList;



public class Board {
	private int position;
	private ArrayList<Cell> cases;
	private Gobelin mob;
	private Menu menu;
	public Character mag;
	private final int BOARD_SIZE = 64;

	public Board() {
		this.cases = new ArrayList<Cell>();
		this.menu = new Menu();
		fillCasesRandomly();
	}

	public void fillCasesRandomly() {
		this.cases.add(0, new EmptyCell());
		
		
		for (int i = 1; i <= BOARD_SIZE; i++) {
			int random = 1 + (int) (Math.random() * 7);

			switch (random) {
			case 1:
			case 2:
				this.cases.add(new EmptyCell());
				break;
			case 3: case 5:
				this.cases.add(new Gobelin());
				break;
			case 4:
				this.cases.add(new Mjolnir());
				break;
			case 7 :
				this.cases.add(new Excalibur());
			case 6:
				this.cases.add(new SmallPotion());
			}
		}
		for (int i = 0; i <= BOARD_SIZE; i ++ ) {
			Cell cellule = this.cases.get(i);
			System.out.println(cellule.toString());
		}
	}
	
	public void positionJoueur(int dice ) {
		if( this.position > BOARD_SIZE) {
			this.position = BOARD_SIZE;
		}
	}
	
	public int rollDice() {
		int dice  = 1+ (int)(Math.random()*6);
		this.position +=dice ;
		positionJoueur(dice);
		return this.position;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Cell currentCellAtPosition() {
		
		return this.cases.get(this.position);
		
	}
}
