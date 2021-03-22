package sn.isi.service;

import sn.isi.entities.Produit;

import java.util.Scanner;

public class IProduitImpl implements IProduit {
    @Override
    public Produit saisie() {
        Produit p = new Produit();
        Scanner s = new Scanner(System.in);
        System.out.println("Entrer la reference :");
        p.setRef(s.nextLine());
        System.out.printf("Entre le libelle :");
        p.setLib(s.nextLine());
        System.out.println("entrer la qte :");
        p.setQte(Double.parseDouble(s.nextLine()));
        System.out.println("entre le prix");
        p.setPrix(Integer.parseInt(s.nextLine()));

        return p;
    }

    @Override
    public void affichage(Produit p) {
        System.out.println("ref : "+p.getRef());
        System.out.println("lib : "+p.getLib());
        System.out.println("qte : "+p.getQte());
        System.out.println("prix : "+p.getPrix());

    }
}
