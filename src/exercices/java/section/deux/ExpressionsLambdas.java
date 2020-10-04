package exercices.java.section.deux;

interface MonInterface {

    void print(String s, String t);
}

public class ExpressionsLambdas {

    public static void affiche(MonInterface printer) {

        printer.print("Coucou", "Hello");
    }

    public static void main(String[] args) {

        affiche((String x,String y) -> {
                    System.out.println(x);
                    System.out.println(y);
                }
        );

    }
}
