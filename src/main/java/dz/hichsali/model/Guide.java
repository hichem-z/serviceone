package dz.hichsali.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "guides")
public class Guide {
    @Id
    private String id;
    private String nom,prenom,datenai,telephone,email,description,photo;

    public Guide(String nom, String prenom, String datenai, String telephone, String email, String description, String photo) {

        this.nom = nom;
        this.prenom = prenom;
        this.datenai = datenai;
        this.telephone = telephone;
        this.email = email;
        this.description = description;
        this.photo = photo;
    }

    public Guide() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatenai() {
        return datenai;
    }

    public void setDatenai(String datenai) {
        this.datenai = datenai;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
