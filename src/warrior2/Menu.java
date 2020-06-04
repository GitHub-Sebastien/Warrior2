package warrior2;


import java.util.Scanner;

public class Menu {
	private Scanner sc;

	public Menu() {
		sc = new Scanner(System.in);
	}

	public int displayMenuNoPlayer() {
		int option = 0;

		do {
			System.out.println(" ==== Bienvenue dans le jeu Warriors !! ====");// Affichage menu
			System.out.println("1 - Cr�er Personnage ");
			System.out.println("2 - Voir les personnages");
			System.out.println("3 - Modifier les personnage");
			System.out.println("4 - Quittez le jeu");

			option = sc.nextInt();// R�cup�ration choix
			sc.nextLine();

		} while (option < 1 || option > 4);
		return option;
	}

	public char displayMenuPlayer() {
		char option = ' ';
		System.out.println("\n 1 - Lancer une partie");
		System.out.println(" 2 - Cr�er un autre personnage ");
		System.out.println(" Q - Revenir au menu principal");
		option = sc.nextLine().charAt(0);
		return option;
	}

	public String displayDice(int dice,int position) {
		String option = "";
		System.out.println("Entr�e - Lancez le d�");
		option = sc.nextLine();
		System.out.println("R�sultat du lanc� de d�  : " + dice + "\n");
		System.out.println("Vous avancez a la case " + position);
		return option;

	}

}
