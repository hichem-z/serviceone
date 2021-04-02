package dz.hichsali.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "banques")
public class Banque {
    @Id
    private String id_baque;
    private String nom,adresse,image,telephone;
    private float x,y;

    public Banque() {
    }

    public Banque(String id_baque, String nom, String adresse, String image, String telephone, float x, float y) {
        this.id_baque = id_baque;
        this.nom = nom;
        this.adresse = adresse;
        this.image = image;
        this.telephone = telephone;
        this.x = x;
        this.y = y;
    }

    public String getId_baque() {
        return id_baque;
    }

    public void setId_baque(String id_baque) {
        this.id_baque = id_baque;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
}
