package exercices.java.section.deux.methodesParDefautSurLesInterfaces;

public interface IPersonne {

    String getNom();
    default String getSiret() {return "Pas de siret";}
}
