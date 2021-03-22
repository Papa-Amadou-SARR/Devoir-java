package main;

import sn.isi.entities.Produit;
import sn.isi.service.IProduit;
import sn.isi.service.IProduitImpl;

public class Main {
    public static void main(String[] args) {
        IProduit p1 = new IProduitImpl();
        Produit p = p1.saisie();
        p1.affichage(p);
    }
}
