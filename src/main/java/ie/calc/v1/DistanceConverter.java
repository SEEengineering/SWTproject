package ie.calc.v1;

import javax.swing.*;

public class DistanceConverter extends JOptionPane {
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

    public void showDistanceGUI() {
        CalcFunctions f = new CalcFunctions();
        Object[] option1 = {"Meters", "Miles", "Yards", "Feet", "Inches", "EngNotation", "Quit"};
        int setSelection = showOptionDialog(null, "Convert " + getCalcInput() +" Metres to",
                "Distance converter", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null,
                option1, option1[2]);

        switch(setSelection) {
            case 0:
                f.KmToMetres(getCalcInput());
                break;
            case 1:
                f.KmToMiles(getCalcInput());
                break;
            case 2:
                f.KmToYards(getCalcInput());
                break;
            case 3:
                f.KmToFeet(getCalcInput());
                break;
            case 4:
                f.KmToInches(getCalcInput());
                break;
            case 5:
                f.KmToEngFormat(getCalcInput());
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
