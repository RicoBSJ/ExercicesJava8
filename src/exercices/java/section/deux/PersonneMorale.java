package exercices.java.section.deux;

public class PersonneMorale implements IPersonne {

    private String raisonsociale;
    private String SIRET;

    @Override
    public String getNom() {
        return raisonsociale;
    }

    @Override
    public String getSiret() {
        return SIRET;
    }

    public PersonneMorale(String nom, String siret){
        this.raisonsociale = nom;
        this.SIRET = siret;
    }

    @Override
    public String toString(){
        return raisonsociale+" "+SIRET;
    }
}
