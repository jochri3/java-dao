package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Implémenter la couche d'accès aux données pour le model Telephone
//Afficher les numéros de téléphone d'un client
//Mettre à jour le client:
//      1 - Récupérer un client par son ID
//      2 - Au traver des setters,mettre à jour un client
//      3 - Envoyer les données mis à jour dans la base de données


public class Client extends ModelDeBase {
    private String nom;
    private String prenom;
    private String email;
    private char genre;
    private Date dateInscription;
    private Date dateNaissance;
    private List<Telephone> telephoneList;

    public Client(int id, String nom, String prenom, String email, char genre, Date dateInscription, Date dateNaissance) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.genre = genre;
        this.dateInscription = dateInscription;
        this.dateNaissance = dateNaissance;
        this.telephoneList=new ArrayList<>();
    }

    public Client(String nom, String prenom, String email, char genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.genre = genre;
    }

    public Client(int id,String nom, String prenom, String email, char genre) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.genre = genre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", genre=" + genre +
                ", dateInscription=" + dateInscription +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
