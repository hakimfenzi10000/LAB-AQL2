package org.example.TP2.jeu.interfaces.impl;

import org.example.TP2.jeu.interfaces.Banque;

public class BanqueImpl implements Banque {
    private int fonds;
    private final int fondsMinimum;

    public BanqueImpl(int fondsInitial, int fondsMinimum) {
        this.fonds = fondsInitial;
        this.fondsMinimum = fondsMinimum;
    }

    public void crediter(int somme) {
        fonds += somme;
    }

    public void debiter(int somme) {
        fonds -= somme;
    }

    public boolean est_solvable() {
        return fonds >= fondsMinimum;
    }
}
