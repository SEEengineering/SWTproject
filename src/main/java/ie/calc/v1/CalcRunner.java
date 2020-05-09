package ie.calc.v1;

import javax.swing.*;

public class CalcRunner {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            new CalcConverterGUI().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}