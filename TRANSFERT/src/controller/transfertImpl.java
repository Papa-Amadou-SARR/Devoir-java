package controller;

import entities.Transfert;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class transfertImpl implements ITransfert{
    //Saisie
    @Override
    public List<Transfert> saisie() {
        Scanner sc = new Scanner(System.in);
        String rep = null;
        Date date = new Date();

        ArrayList<Transfert> transferts = new ArrayList<Transfert>();
        do {
            Transfert t1 = new Transfert();

            System.out.println("Entrer l'id du transfert");
            t1.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entrer le libelle du transfert");
            t1.setLibelle(sc.nextLine());
            System.out.println("Entrer le montant du transfert");
            t1.setMontant(Double.parseDouble(sc.nextLine()));
            System.out.println("Entrer la date du transfert : j/m/a");

            try {
                SimpleDateFormat d = new SimpleDateFormat("DD/MM/YYYY");
                date = d.parse(sc.nextLine());
                t1.setDate(date);
            } catch (Exception ex) {
                    ex.printStackTrace();
            }
            transferts.add(t1);
            System.out.println("Continue O/N");
            rep = sc.nextLine();

        } while (rep.equalsIgnoreCase("o"));
        return transferts;
    }

    @Override
    public void affichage(List<Transfert> transferts) {
        for (Transfert transfert : transferts) {
            System.out.println("ID : " + transfert.getId());
            System.out.println("Libelle :" + transfert.getLibelle());
            System.out.println("Montant :" + transfert.getMontant());
            System.out.println("Date :" + transfert.getDate());

        }
    }
}
