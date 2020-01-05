package goodyear.classes;

public class Personne implements hasPrenom, hasStatut {

    protected String firstName;
    protected String statut;


    public Personne(String prenom) {
        this.firstName = prenom;
    }

    @Override
    public String getPrenom() {
        return firstName;
    }

    @Override
    public String getStatut() {
        return statut;
    }


}