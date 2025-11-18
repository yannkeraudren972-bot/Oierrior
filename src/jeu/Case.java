package jeu;

public class Case {
	
	private int numCase;
	
	public Case(int numCase) {
		
		this.numCase = numCase;
		
	}
	
	public String getNom() {
		
		String s = "numéro " + this.numCase;
		
		return s;
	}
	
	public int getNum() {
		
		return this.numCase;
	}
	
	public Case depart(Oie oie) {
		return this;
	}
	
	public Case arrivee(Oie oie) {
		return this;
	}

	protected Case suivante(Oie oie, int numCaseDestination) {
		return this;
	}
}
