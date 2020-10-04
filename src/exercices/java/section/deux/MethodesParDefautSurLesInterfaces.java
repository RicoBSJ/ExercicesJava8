package exercices.java.section.deux;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MethodesParDefautSurLesInterfaces extends JFrame {

    public MethodesParDefautSurLesInterfaces(){

        JLabel texte = new JLabel("Clique la croix pour tuer le processus");
        add(texte);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

                System.out.println(0);
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        pack();
    }

    public static void main(String[] args){

        /*MethodesParDefautSurLesInterfaces f = new MethodesParDefautSurLesInterfaces();
        f.setVisible(true);*/

        PersonnePhysique pp = new PersonnePhysique("Eric AUBRUN");
        System.out.println(pp);

        PersonneMorale pm = new PersonneMorale("eixa6", "44219374400011");
        System.out.println(pm);
    }
}
