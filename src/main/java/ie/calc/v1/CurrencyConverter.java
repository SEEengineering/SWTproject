package ie.calc.v1;

import javax.swing.*;

public class CurrencyConverter {
    public CurrencyConverter(String input) {
        CalcFunction f = new CalcFunction();
        Object[] option1 = {"Pound", "YEN","US","Bitcoin","AustralianDollar","Quit"};
        Object[] option2 = {"Try Again", "Quit"};

            if (f.check(input) == true) {
                double Minput = Double.parseDouble(input);
                int choice1 = JOptionPane.showOptionDialog(null, "Choose Which Currency you wish to convert",
                        "currency converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        option1, option1[2]);
                if (choice1 == 0) {
                    f.EuroTopound(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you want to do", "currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {
                    }
                } else if (choice1 == 1) {
                    f.EuroToJPY(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you want to do", "currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {
                    }
                } else if (choice1 == 2) {
                    f.EuroToUS(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you want to do", "currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {
                    }
                } else if (choice1 == 3) {
                    f.EuroToBitcoin(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you want to do", "currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {

                    }
                } else if (choice1 == 4) {
                    f.EuroToAustraliandollar(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you want to do", "currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {

                    }
                } else if (choice1 == 5) {

                } else {
                    JOptionPane.showMessageDialog(null, "invalid output");
                    int choice2 = JOptionPane.showOptionDialog(null, "Invalid,Try again", "currency converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {

                    }
                }
            }
    }
}