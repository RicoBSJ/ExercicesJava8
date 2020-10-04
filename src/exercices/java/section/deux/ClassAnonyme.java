package exercices.java.section.deux;

import javax.swing.*;

public class ClassAnonyme extends JFrame {

    public ClassAnonyme() {

        JButton monButton = new JButton("Clique moi");
        add(monButton);

        monButton.addActionListener(ae ->
                System.out.println("Clique moi a fonctionné"));
        pack();
    }


    public static void main(String[] args) {

        ClassAnonyme f = new ClassAnonyme();
        f.setVisible(true);
    }
}
