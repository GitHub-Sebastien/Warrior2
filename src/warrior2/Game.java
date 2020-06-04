package warrior2;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	// Attributs
	private Board board;
	private Character player;
	private Character mob;
	private Menu menu;
	private Scanner sc;
	private int etatDuJeu;
	private final int NEW_GAME = 1;
	private final int CREATE_CHAR = 2;
	private final int NEW_CHAR = 3;
	private final int IN_GAME = 4;
	private final int CREATE_NEW_CHAR = 5;
	public final int END_GAME = 6;
	private final static int CASE_MAX = 30;
	
	public int getEtatDuJeu() {
		return etatDuJeu;
	}

	public void setEtatDuJeu(int etatDuJeu) {
		this.etatDuJeu = etatDuJeu;
	}

	
	

	// Constructeur
	public Game() {
		this.sc = new Scanner(System.in);
		this.menu = new Menu();
		this.board = new Board();
		this.etatDuJeu = NEW_GAME;
	}

	// Méthode instancier pour lancer le jeu
	public void playGame() {

		switch (etatDuJeu) {
		case NEW_GAME:
			this.getChoiceNoPlayer();
			break;
			
		case CREATE_CHAR:
			this.getChoicePlayer();
			break;
			
		case CREATE_NEW_CHAR:
			this.getChoicePlayer();
			this.play();
			break;
			
		case IN_GAME:
			this.play();
			break;
			
		case END_GAME:
			System.out.println("Fin du jeu ");
			break;
		}
	}

//Permet de jouer un tour 
	private void play() {
		
		int positionPlayer = board.rollDice();
		menu.displayDice(positionPlayer, board.getPosition());
		board.currentCellAtPosition().interactWithPlayer(this.player);
		etatDuJeu = IN_GAME;
		//le joueur a une arme 
		//statut = armeEquipé
	}

	// Récpére le choix du joueur depuis la classe menu
	public void getChoiceNoPlayer() {
		int choiceNoPlayer = menu.displayMenuNoPlayer();
		switch (choiceNoPlayer) {

		case 1:
			this.createCharacter();// Appelle de la fontion pour crée un personnage
			etatDuJeu = CREATE_CHAR;// L'état du jeu passera au stade de création de personnage
			break;
		case 2:
			Magician mag = new Magician("Wizard", 10, 6); // Affichage de classe par défaut
			System.out.println("1 - " + mag.toString() + "\n");
			Warrior war = new Warrior("Arthur", 12, 8);
			System.out.println("2 - " + war.toString() + "\n");
			etatDuJeu = NEW_GAME;
			break;
		case 3:
			System.out.println("Fonctionnalité a venir");

			break;
		case 4:
			System.out.println("See you space cowboys");
			break;

		default:
			System.out.println("Veuillez faire un choix valide");
			break;
		}
	}

	public void getChoicePlayer() {
		char choicePLayer = menu.displayMenuPlayer();
		switch (choicePLayer) {

		case '1':
			this.play();
			break;

		case '2':
			etatDuJeu = CREATE_NEW_CHAR;
			//this.createCharacter();
			break;

		case 'q':
			menu.displayMenuNoPlayer();
			etatDuJeu = NEW_GAME;
			break;
		default:
			System.out.println("Veuillez faire un choix valide");
			break;
		}
	}

//Permet de créer un personnage
	public void createCharacter() {
		char characterSelect = ' ';
		String name;
		do {
			System.out.println(" Créer Personnage  \n 1 - Guerrier \n 2 - Magicien ");
			characterSelect = sc.nextLine().charAt(0);

			if (characterSelect != '1' && characterSelect != '2') {
				System.out.println("Veuillez faire un choix valide \n");
			}

			else if (characterSelect == '1') {
				System.out.println("Vous avez choisis le guerrier");
				System.out.print("Choisisez un pseudo : ");
				name = sc.nextLine();
				Warrior war = new Warrior(name);
				this.player = war;
				System.out.println(war.toString());

			}

			else {
				System.out.println("Vous avez choisi le magicien ");
				System.out.print("Choisisez un pseudo : ");
				name = sc.nextLine();
				Magician mag = new Magician(name);
				this.player = mag;
				System.out.println(mag.toString());
			}

		} while (characterSelect < '1' || characterSelect > '2');

	}

	// Génére un dé aléatoire
//	public int rollDice()  {
//		int dice = 1 + (int) (Math.random() * 6);
//		try {
//			movePlayer(dice);
//		} catch (MovePlayerException e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
//		return dice;
//	}
//
//// Met a jour la position du joueur par rapport au dé 
//	private void movePlayer(int dice) throws MovePlayerException {
//		this.position += dice;
//
//		if (this.position > CASE_MAX)
//			throw new MovePlayerException();
//	}	
}
