package dz.hichsali.model;

public class Bureau {
    private int id;
    private String nom,adresse, map;

    public Bureau() {
    }

    public Bureau(int id, String nom, String adresse, String map) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.map = map;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
