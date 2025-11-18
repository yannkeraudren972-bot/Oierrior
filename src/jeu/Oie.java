package jeu;

public class Oie {
	
	private Plateau plateau;
	private Journal journal = new Journal();
	private De de;
	private Couleur couleur;
	private Case casePlateau;
	
	
	public Oie (Couleur couleur, Plateau plateau, De de) {
		
		this.couleur = couleur;
		this.de = de;
		this.plateau = plateau;
		this.casePlateau = plateau.donnerCase(0);
	}
	
	public Plateau getPlateau() {
		return this.plateau;
	}
	
	public Couleur getCouleur() {
		return this.couleur;
	}
	
	public boolean action() {
		return true;
	}
	
	public int lancerDe() {
		return de.lancer();
	}
	
	public void ajouterMessage(String message) {
		journal.ajouterMessage(message);
	}
	
	
	
}
