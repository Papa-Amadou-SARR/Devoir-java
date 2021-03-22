package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.traitement.EcoleImp;
import sn.isi.traitement.IEcole;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IEcole iecole = new EcoleImp();
        Map<Specialite, Ecole> listEcole = iecole.saisie();
        iecole.affichageEcoles(listEcole);
    }
}
