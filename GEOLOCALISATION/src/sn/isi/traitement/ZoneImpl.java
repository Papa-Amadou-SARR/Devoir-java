package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.Scanner;

public class ZoneImpl implements IZone {
    @Override
    public Zone saisie() {
        Scanner sc = new Scanner(System.in);
        Zone zones = new Zone();
        System.out.println("Entrer l'id de la zone");
        zones.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le nom de la zone");
        zones.setNom(sc.nextLine());
        System.out.println("Entrer la longitude de la zone");
        zones.setLongitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Entrer la latitude de la zone");
        zones.setLatitude(Double.parseDouble(sc.nextLine()));

        return zones;
    }

    @Override
    public void affichage(Zone zone) {
        System.out.println("-------------------Affichage zone-------------------");
        System.out.println("L'id de la zone est "+zone.getId());
        System.out.println("Le nom de la zone est "+zone.getNom());
        System.out.println("La longitude de la zone est "+zone.getLongitude());
        System.out.println("La latitude de la zone est "+zone.getLatitude());

    }
}
