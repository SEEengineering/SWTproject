package ie.calc.v1;

import javax.swing.*;

public class CalcFunctions {
    public boolean check(String input){
        try{
        double x = Double.parseDouble(input);
        if (x>=10 || x<0);
        return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void EuroTopound(double Minput){
        double pound = Minput / 1.14 ;
        JOptionPane.showMessageDialog(null,"Amount of pound:" + pound+"£");
    }

    public void EuroToJPY(double Minput){
        double JPY = Minput * 0.00869111767;
        JOptionPane.showMessageDialog(null,"Amount of JPY:" + JPY +"kr");
    }

    public void EuroToUS(double Minput){
        double US = Minput * 0.92;
        JOptionPane.showMessageDialog(null,"Amount of JPY:" + US +"$");
    }

    public void EuroToBitcoin(double Minput){
        double Bitcoin = Minput * 0.92;
        JOptionPane.showMessageDialog(null,"Amount of JPY:" + Bitcoin +"฿");
    }

    public void EuroToAustraliandollar(double Minput){
        double AustralianDollar = Minput * 0.59;
        JOptionPane.showMessageDialog(null,"Amount of JPY:" + AustralianDollar +"a$");
    }

    public void GramsToPounds(double Minput) {
        double pound = Minput / 454;
        JOptionPane.showMessageDialog(null,"Mass in Pounds: " + pound +"lbs");
    }

    public void GramsToStone(double Minput) {
        double stone = Minput / 6350;
        JOptionPane.showMessageDialog(null,"Mass in Stone: " + stone +"st");
    }
    public void GramsToOunce(double Minput) {
        double ounce = Minput / 28.35;
        JOptionPane.showMessageDialog(null,"Mass in Ounce: " + ounce +"oz");
    }
    public void GramsToEngFormat(double Minput) {
        JOptionPane.showMessageDialog(null,"Grams in engineering notation: " +
                new EngNotation(Minput).getEng());
    }
}
