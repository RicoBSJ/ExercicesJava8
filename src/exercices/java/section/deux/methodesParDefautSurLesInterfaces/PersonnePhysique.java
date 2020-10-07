package exercices.java.section.deux.methodesParDefautSurLesInterfaces;

public class PersonnePhysique implements IPersonne {

    private String nom;

    @Override
    public String getNom() {
        return nom;
    }

    public PersonnePhysique(String nom){
        this.nom = nom;
    }

    @Override
    public String toString(){
        return nom+" "+getSiret();
    }
}
