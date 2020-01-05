package goodyear;

import goodyear.classes.Etudiant;
import goodyear.classes.Formateur;
import goodyear.classes.Personne;
import java.util.ArrayList;
import java.util.List;


public final class App {
    
    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<Personne>();
        addStudent(personnes);
        addFormateur(personnes);
        happyNewYear(personnes);

    }



    private static void happyNewYear(List<Personne> personnes) {
        for (Personne personne : personnes) {

            if (personne.getStatut() == "Formateur")
            {
                if (personne.getPrenom() == "Patrice")
                {
                    System.out.println("Console.Readline()");
                    System.out.println("IT'S PATRICE!!!");
                    System.out.println("Console.WriteLine(\"Bonne année, Patrice !!\");");
                }
                else {
                    System.out.println("Bonne Année " + personne.getPrenom() + " Formateur à Valarep");
                }
                
            } else {
                if (!personne.getPrenom().equals("Cédric")) {
                    System.out.println("Bonne Année " + personne.getPrenom() + " Etudiant à Valarep");
                } else {
                    System.out.println("Console.WriteLine(\"Bonne année, Cédric !\");");
                }
            }
        }
    }

    private static void addStudent(List<Personne> personnes) {
        String statut = "Etudiant";

        personnes.add(new Etudiant("Cédric", statut));
        personnes.add(new Etudiant("Vincent", statut));
        personnes.add(new Etudiant("Greg", statut));
        personnes.add(new Etudiant("Camille", statut));
        personnes.add(new Etudiant("Yann", statut));
        personnes.add(new Etudiant("Lila", statut));
        personnes.add(new Etudiant("Akeem", statut));
        personnes.add(new Etudiant("Butters", statut));
        personnes.add(new Etudiant("Romy", statut));
        personnes.add(new Etudiant("Gaelle", statut));
        personnes.add(new Etudiant("Tony", statut));
        personnes.add(new Etudiant("Yann", statut));
        personnes.add(new Etudiant("Alexis", statut));
    }

    private static void addFormateur(List<Personne> formateurs) {
        String statut = "Formateur";

        formateurs.add(new Formateur("David", statut));
        formateurs.add(new Formateur("Patrice", statut));
        formateurs.add(new Formateur("Régis", statut));
        formateurs.add(new Formateur("Arnaud", statut));
    }
}
