package goodyear.classes;


public class Etudiant extends Personne {

    public Etudiant(String prenom, String statut) {
        super(prenom);
        this.statut = statut;
    }
}