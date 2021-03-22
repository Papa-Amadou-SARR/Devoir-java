package controller;

import entities.Transfert;

import java.util.List;

public interface ITransfert {
    //Saisie liste
    public List<Transfert> saisie();
    //Affichage liste
    public void affichage(List<Transfert>transferts);
}
