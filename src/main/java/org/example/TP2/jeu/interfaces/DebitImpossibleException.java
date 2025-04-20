package org.example.TP2.jeu.interfaces;

public class DebitImpossibleException extends Exception {
    public DebitImpossibleException() {
        super("Le joueur n'a pas assez d'argent");
    }
}
