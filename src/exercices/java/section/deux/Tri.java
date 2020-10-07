package exercices.java.section.deux;

import java.util.Arrays;

public class Tri {

    public static void main(String[] args){

        Personne[] leTableau = new Personne[2];

        leTableau[0] = new Personne("Fabien", 48);
        leTableau[1] = new Personne("Corinne", 47);

        System.out.println(leTableau[0]);
        System.out.println(leTableau[1]);

        Arrays.sort(leTableau, Personne::compareA);

        System.out.println(leTableau[0]);
        System.out.println(leTableau[1]);
    }

}
