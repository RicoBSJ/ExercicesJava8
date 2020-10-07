package exercices.java.section.trois.interfaceFunction;

public class InterfaceFunction {



    public static void main(String[] args){

        //Interface Function<T, R>

        Client monClient = new Client("Fabien");
        String str = monClient.rendre((Client c)->{return c.getNom();});
        System.out.println("Le client est rendu : "+str);
        str = monClient.rendre((Client c)->{return "<b>"+c.getNom()+"</b>";});
        System.out.println("Le client est rendu : "+str);

        Facture f = new Facture("2016-01");
        System.out.println("Facture intiale : "+f.getNumero());
        f.increment(s-> {return s+"1";});
        System.out.println("Facture finale : "+f.getNumero());

        monClient.setFacture(f);
        String resultat = monClient.lie((Client c, Facture ff) -> {return c.getNom()+" "+ ff.getNumero();});
        System.out.println("Resultat "+resultat);
    }
}
