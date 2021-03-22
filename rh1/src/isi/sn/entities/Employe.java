package isi.sn.entities;

public class Employe extends Personne {
    private Service service;
    //le constructeur sans argument
    public Employe() {
    }
    //le constructeur avec argument
    public Employe(int id, String nomP, String prenomP, String emailP, String passwordP, String etatP, Service service) {
        super(id, nomP, prenomP, emailP, passwordP, etatP);
        this.service = service;
    }

    //les getteurs et setteurs
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
