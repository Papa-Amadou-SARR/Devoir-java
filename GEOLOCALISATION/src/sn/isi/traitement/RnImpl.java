package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImpl implements IRn {
    @Override
    public Rn saisie() {
        Scanner sc = new Scanner(System.in);
        List<Zone>zones = new ArrayList<Zone>();

        Rn rn = new Rn();
        String rep = null;
        do {
            Zone zone = new Zone();
            IZone izone = new ZoneImpl();
            System.out.println("----------------Saisie route----------------");
            izone.saisie();
           /* System.out.println("Entrer l'id de la zone");
            zone.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entrer le nom de la zone");
            zone.setNom(sc.nextLine());
            System.out.println("Entrer la longitude de la zone");
            zone.setLongitude(Double.parseDouble(sc.nextLine()));
            System.out.println("Entrer la latitude de la zone");
            zone.setLatitude(Double.parseDouble(sc.nextLine()));*/
            zones.add(zone);

            System.out.println("Voulez-vous augmenter une autre zone : o/n");
            rep = sc.nextLine();
        }while (rep.equalsIgnoreCase("o"));

        rn.setZones(zones);
        System.out.println("Entrer l'id de la route");
        rn.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer la longitude de la roue");
        rn.setLongitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Entrer la latitude de la route");
        rn.setLatitude(Double.parseDouble(sc.nextLine()));




        return rn;
    }

    @Override
    public void affichage(Rn rn) {
    List<Zone>zones = new ArrayList<Zone>();
    zones = rn.getZones();

        for (Zone z : zones){
            IZone izone = new ZoneImpl();
            System.out.println("--------------------Affichage route-------------------");
            izone.affichage(z);
            /*System.out.println("L'id de la zone est "+z.getId());
            System.out.println("Le nom de la zone est "+z.getNom());
            System.out.println("La longitude de la zone est "+z.getLongitude());
            System.out.println("La latitude de la zone est "+z.getLatitude());*/
        }
        System.out.println("L'id "+rn.getId());
        System.out.println("La longitude de la route est "+rn.getLongitude());
        System.out.println("La latitude de la route est "+(rn.getLatitude()));

    }
}
