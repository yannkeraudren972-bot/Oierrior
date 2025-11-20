package main;

import jeu.JeuOie;
import jeu.Couleur;

public class Test {
	public static void main(String argv[]){
       
		
		JeuOie jeuOie = new JeuOie(3);
        jeuOie.ajouterOie(Couleur.VERTE);
	    jeuOie.ajouterOie(Couleur.JAUNE);
        jeuOie.ajouterOie(Couleur.BLEU);
        jeuOie.jouer();
        
	}


}
