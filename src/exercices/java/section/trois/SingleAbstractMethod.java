package exercices.java.section.trois;

import javax.swing.*;

public class SingleAbstractMethod extends JFrame {

    public SingleAbstractMethod() {

        JButton monBouton = new JButton("clic");
        add(monBouton);

        /*monBouton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Coucou");
            }
        });*/

        monBouton.addActionListener(ae -> System.out.println("Coucou"));

        pack();
    }

    public static void appelInterfaceSAM(MonInterfaceSAM i){

        i.execute();
    }

    public static void main(String[] args){

        appelInterfaceSAM(()-> System.out.println("execution"));
    }
}