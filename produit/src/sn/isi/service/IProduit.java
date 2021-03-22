package sn.isi.service;

import sn.isi.entities.Produit;

public interface IProduit {
    public Produit saisie();
    public void affichage(Produit p);
}
