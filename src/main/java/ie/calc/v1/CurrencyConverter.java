package ie.calc.v1;

import javax.swing.*;

public class CurrencyConverter extends JOptionPane implements DisplayUI  {
    public double getMinput() {
        return Minput;
    }

    private double Minput;
    public CurrencyConverter(String input) {

        if (input.equals("")||input==null){
            throw new IllegalArgumentException("incorrect input");
        }
        else{ this.Minput = Double.parseDouble(input);

        }


    }
    public void showUI(){
        CalcFunctions f = new CalcFunctions();
        Object[] option1 = {"Pound", "YEN","US","Bitcoin","AustralianDollar","Quit"};
            int choice1 = JOptionPane.showOptionDialog(null, "Choose Which Currency you wish to convert",
                    "currency converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    option1, option1[2]);
            if (choice1 == 0) {
                JOptionPane.showMessageDialog(null,"Amount of GBP:" + f.EuroTopound(Minput) +"£");
            } else if (choice1 == 1) {
                JOptionPane.showMessageDialog(null,"Amount of Yen:" + f.EuroToJPY(Minput) +"¥");
            } else if (choice1 == 2) {
                JOptionPane.showMessageDialog(null,"Amount of Dollar:" + f.EuroToUS(Minput) +"$");
            } else if (choice1 == 3) {
                JOptionPane.showMessageDialog(null,"Amount of BTC:" + f.EuroToBitcoin(Minput) +"฿");
            } else if (choice1 == 4) {
                JOptionPane.showMessageDialog(null,"Amount of AUS:" + f.EuroToAustraliandollar(Minput) +"AU$");
            } else if (choice1 == 5) {
                this.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "invalid output");
            }
    }
}
