package main;

import sn.isi.entities.Rn;
import sn.isi.traitement.IRn;
import sn.isi.traitement.RnImpl;

public class Main {
    public static void main(String[] args) {
        IRn r = new RnImpl();
        Rn rn = r.saisie();
        r.affichage(rn);
    }
}
