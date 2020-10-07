package exercices.java.section.trois.interfaceFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Client {

    private String nom;
    private Facture facture;

    public Client(String nom) {
        this.nom = nom;
    }

    public void setFacture(Facture f) {
        this.facture = f;
    }

    public String getNom() {
        return nom;
    }

    String rendre(Function<Client, String> rendu){

        return rendu.apply(this);
    }

    String lie(BiFunction<Client, Facture, String> liaison){

        return liaison.apply(this, facture);
    }
}
