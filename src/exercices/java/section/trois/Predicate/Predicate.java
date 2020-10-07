package exercices.java.section.trois.Predicate;

import java.util.List;

public class Predicate {

    public static void main(String[] args){

        Catalogue cat = new Catalogue();
        cat.ajoute(new Article("Bouteille", 10));
        cat.ajoute(new Article("Sandwich", 5));
        cat.ajoute(new Article("Cahier", 2));

        List<Article> resultat = cat.rechercheArticlePrix( a -> {return a.getPrix()<6;});

        for(Article i : resultat){
            System.out.println("Article "+i.getNom());
        }
    }
}
