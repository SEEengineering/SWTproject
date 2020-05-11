package ie.calc.v1;

import javax.swing.*;

public class DistanceConverter extends JOptionPane implements DisplayUI{
    private String calcInput;
    public DistanceConverter(String input) {
        if(input == null || input.equals(""))
            throw new IllegalArgumentException("Missing Data");
        else
            this.calcInput = input;

    }

    public double getCalcInput() {
        return Double.parseDouble(calcInput);
    }

    public void showUI() {
        CalcFunctions f = new CalcFunctions();
        Object[] option1 = {"Meters", "Miles", "Yards", "Feet", "Inches", "EngNotation", "Quit"};
        int setSelection = showOptionDialog(null, "Convert " + getCalcInput() +" Metres to",
                "Distance converter", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null,
                option1, option1[2]);

        switch(setSelection) {
            case 0:
                JOptionPane.showMessageDialog(null,"Km in Metres: " + f.KmToMetres(getCalcInput()) +" Metres");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Km in Miles: " + f.KmToMiles(getCalcInput()) +" Miles");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Km in Yards: " + f.KmToYards(getCalcInput()) +" Yards");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Km in Feet: " + f.KmToFeet(getCalcInput()) +" Feet");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Km in Inches: " + f.KmToInches(getCalcInput()) +" Inches");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Km in engineering notation: " +
                        f.KmToEngFormat(getCalcInput()));
                break;
            case 6:
                this.setVisible(false);
                break;
            default:
                showMessageDialog(null,"Something Went wrong and Event has been log",
                        "Inane warning",WARNING_MESSAGE);
        }
    }
}
