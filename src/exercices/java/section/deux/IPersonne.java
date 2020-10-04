package exercices.java.section.deux;

public interface IPersonne {

    String getNom();
    default String getSiret() {return "Pas de siret";}
}
