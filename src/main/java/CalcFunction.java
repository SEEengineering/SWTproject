import javax.swing.*;

public class CalcFunction {
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
}
