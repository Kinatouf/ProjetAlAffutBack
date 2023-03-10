package fr.alaffut.springboot.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import fr.alaffut.springboot.enums.Civilite;

public class EtudiantDto {
    
    private int version;
    
    private long id;
    
    private Civilite civilite;
    
    private String nom;
    
    private String prenom;
    
    private LocalDate dateNaissance;
    
    private String email;
    
    private String password;
    
    private String etablissementScolaire;
    
    @JsonIgnore
    private List<EvenementDto> evenements= new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEtablissementScolaire() {
        return etablissementScolaire;
    }

    public void setEtablissementScolaire(String etablissementScolaire) {
        this.etablissementScolaire = etablissementScolaire;
    }
    

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    


    public List<EvenementDto> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<EvenementDto> evenements) {
        this.evenements = evenements;
    }

    @Override
    public String toString() {
        return "EtudiantDto [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom
                + ", dateNaissance=" + dateNaissance + ", email=" + email + ", password=" + password
                + ", etablissementScolaire=" + etablissementScolaire + "]";
    }
    

}
