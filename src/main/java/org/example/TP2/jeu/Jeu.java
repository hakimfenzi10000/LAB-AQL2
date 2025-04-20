package org.example.TP2.jeu;


import org.example.TP2.jeu.interfaces.Banque;
import org.example.TP2.jeu.interfaces.De;
import org.example.TP2.jeu.interfaces.DebitImpossibleException;
import org.example.TP2.jeu.interfaces.Joueur;
import org.example.TP2.jeu.JeuFermeException;


public class Jeu {
    private Banque banque;
    private boolean ouvert;

    public Jeu(Banque banque) {
        this.banque = banque;
        this.ouvert = true;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException {
        if (!estOuvert()) {
            throw new JeuFermeException();
        }

        try {
            int mise = joueur.mise();
            joueur.debiter(mise);
            banque.crediter(mise);

            int resultat = de1.lancer() + de2.lancer();

            if (resultat == 7) {
                int gain = mise * 2;
                banque.debiter(gain);
                joueur.crediter(gain);

                if (!banque.est_solvable()) {
                    fermer();
                }
            }
        } catch (DebitImpossibleException e) {
            // Joueur insolvable
        }
    }

    public void fermer() {
        this.ouvert = false;
    }

    public boolean estOuvert() {
        return ouvert && banque.est_solvable();
    }
}