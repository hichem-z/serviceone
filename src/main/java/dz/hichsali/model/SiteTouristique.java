package dz.hichsali.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "siteTouristique")
public class SiteTouristique {

    @Id
    private String id;
    private float x,y;
    private String nom,description,adresse;
    private List<String> image = new ArrayList<>();

    public SiteTouristique(String id, float x, float y, String nom, String description, String adresse) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
    }

    public SiteTouristique() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
}
