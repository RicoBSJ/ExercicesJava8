package exercices.java.section.trois.interfaceFunction;

import java.util.function.UnaryOperator;

public class Facture {

    private String numero;

    public Facture(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    void increment(UnaryOperator<String> inc){
        numero = inc.apply(numero);
    }
}
