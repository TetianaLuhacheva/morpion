package fr.tetiana.morpion;

//class pas de parentaise 
public class Main {
	

	//methode il y a toujours des parentaise 
	public static void main(String[] args) {
		//Menu.display(false);
		//Console.close();
		//variable ont un type ex: string/int
		// Joueur 1

		Out.r("Bienvenue ! :)\n");
		
		Joueur joueur = new Joueur();
		// joueur.getJoueur1() c'est X
		// joueur.getJoueur2() c'est O*/
		
		//variable
		//String[][] mouiorpion = TicTacToe.morpionCree();
		int[] score = TicTacToe.scoreCree();
				

		TicTacToe.boucleJeu(joueur.getJoueur1(), joueur.getJoueur2(), score);

		// Struture pour lancer une fonctionne:
		// NOM_DE_CLASS.NOM_METODE(PARAMTRES);
	}

}





