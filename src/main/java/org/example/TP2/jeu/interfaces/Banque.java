package org.example.TP2.jeu.interfaces;

public interface Banque {
    void crediter(int somme);
    boolean est_solvable();
    void debiter(int somme);
}