package fr.tetiana.morpion;

//class maj
public class Joueur {	
	//methode minuscule 

	private String joueur1 = "X";
	private String joueur2 = "O";
	
	//void n'attend pas de reponse en retour
	public void joueur(String joueur1, String joueur2) {
		this.joueur1 = joueur1;
		this.joueur2 = joueur2; 
	}

	// Getter
	public String getJoueur1() {
		return joueur1;
	}
	public String getJoueur2() {
		return joueur2;
	}
}
