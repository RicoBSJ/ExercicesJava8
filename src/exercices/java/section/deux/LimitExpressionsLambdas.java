package exercices.java.section.deux;

import javax.swing.*;
import java.awt.*;

public class LimitExpressionsLambdas extends JFrame {

    JTextField texte;
    public LimitExpressionsLambdas(){

        setLayout(new FlowLayout());

        texte = new JFormattedTextField("Hello Java World");
        add(texte);

        JButton clic = new JButton("Clic");
        add(clic);

        clic.addActionListener(ae -> texte.setText("Bonjour"));

        pack();
    }

    public static void main(String[] args){

        LimitExpressionsLambdas f = new LimitExpressionsLambdas();
        f.setVisible(true);
    }
}
