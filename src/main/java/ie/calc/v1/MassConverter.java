package ie.calc.v1;

import javax.swing.*;

public class MassConverter extends JOptionPane {
    private int selection;
    private String calcInput;
    public MassConverter(String input) {
        this.calcInput = input;
        CalcFunction f = new CalcFunction();
        Object[] option1 = {"Pound", "Stone", "Ounce", "EngNotation", "Quit"};
        setSelection(JOptionPane.showOptionDialog(null, "Convert " + getCalcInput() +" grams to",
                "Mass converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                option1, option1[2]));

        switch(getSelection()) {
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
    private int getSelection() {
        return selection;
    }

    private void setSelection(int selectedOption) {
        this.selection = selectedOption;
    }

    private double getCalcInput() {
        return Double.parseDouble(calcInput);
    }

}
