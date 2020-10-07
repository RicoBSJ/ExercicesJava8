package exercices.java.section.trois.annotationInterfacesFonctionnelles;

public class InterfaceFonctionnelle {



    public static void main(String[] args){

        declencheExecution(()-> System.out.println("Execution"));

        MonInterface maFonction = () -> System.out.println("Execution retardée");

        maFonction.execute();

        MaClasse monObjet = new MaClasse();

        maFonction = monObjet::execute;

        maFonction.execute();

        declencheExecution(monObjet::execute);
    }

    public static void declencheExecution(MonInterface mi){

        mi.execute();
    }
}
