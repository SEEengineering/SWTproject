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

    public void dollarToNok(double input){
        double nok = input * 8.2;
        JOptionPane.showMessageDialog(null,"Amount of Nok:" + nok+"kr");
    }
    public void dollarToJPY(double input){
        double JPY = input * 112.7;
        JOptionPane.showMessageDialog(null,"Amount of JPY:" + JPY+"kr");
    }
}
