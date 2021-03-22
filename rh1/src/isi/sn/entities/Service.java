package isi.sn.entities;

public class Service {
    private int id ;
    private String nomService;

    //le constructeur sans argument
    public Service() {
    }

        //le constructeur avec argument
    public Service(int id, String nomService) {
        this.id = id;
        this.nomService = nomService;
    }

    //les getters et setteurs
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }
}
