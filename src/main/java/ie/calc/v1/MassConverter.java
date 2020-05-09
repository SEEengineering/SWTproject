package ie.calc.v1;

import javax.swing.*;

public class MassConverter extends JOptionPane {
    private String calcInput;
    public MassConverter(String input) {
        if(input == null || input.equals(""))
            throw new IllegalArgumentException("Missing Data");
        else
            this.calcInput = input;

    }

    public double getCalcInput() {
        return Double.parseDouble(calcInput);
    }

    public void showMassGUI() {
        CalcFunctions f = new CalcFunctions();
        Object[] option1 = {"Pound", "Stone", "Ounce", "EngNotation", "Quit"};
        int setSelection = showOptionDialog(null, "Convert " + getCalcInput() +" grams to",
                "Mass converter", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null,
                option1, option1[2]);

        switch(setSelection) {
            case 0:
                f.GramsToPounds(getCalcInput());
                break;
            case 1:
                f.GramsToStone(getCalcInput());
                break;
            case 2:
                f.GramsToOunce(getCalcInput());
                break;
            case 3:
                f.GramsToEngFormat(getCalcInput());
                break;
            case 4:
                this.setVisible(false);
                break;
            default:
                showMessageDialog(null,"Something Went wrong and Event has been log",
                        "Inane warning",WARNING_MESSAGE);
        }
    }
}
