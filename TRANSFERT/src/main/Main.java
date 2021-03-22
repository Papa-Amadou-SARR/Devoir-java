package main;

import controller.ITransfert;
import controller.transfertImpl;
import entities.Transfert;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ITransfert t2 = new transfertImpl();
        ArrayList<Transfert> t3 = (ArrayList<Transfert>) t2.saisie();
        t2.affichage((List<Transfert>) t3);

    }
}

