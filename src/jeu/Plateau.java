package jeu;

public class Plateau {
	
	private static final int NB_CASES = 63;
	
	private Case cases[] = new Case[NB_CASES];
	
	public Plateau() {
		
		for (int i = 0; i < NB_CASES; i++) {
			this.cases[i] = new Case(i);
		}
	}
	
	private void initialisationCaseSpecifique() {
		
	}
	
	public Case donnerCase(int numCase) {
		return cases[numCase];
	}
	

}
