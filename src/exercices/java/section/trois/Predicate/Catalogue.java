package exercices.java.section.trois.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Catalogue {

    List<Article> lesArticles = new ArrayList<Article>();

    void ajoute(Article art) {

        lesArticles.add(art);
    }

    List<Article> rechercheArticlePrix(Predicate<Article> f) {

        List<Article> retval = new ArrayList<Article>();

        for (Article a : lesArticles) {
            if (f.test(a)) {
                retval.add(a);
            }
        }
        return retval;
    }
}
