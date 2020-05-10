package ie.calc.v1;

import javax.swing.*;

public class VolumeConverter extends JOptionPane {
    private String calcInput;
    public VolumeConverter(String input) {
        if(input == null || input.equals(""))
            throw new IllegalArgumentException("Missing Data");
        else
            this.calcInput = input;

    }

    public double getCalcInput() {
        return Double.parseDouble(calcInput);
    }

    public void showVolumeGUI() {
        CalcFunctions f = new CalcFunctions();
        Object[] option1 = {"Gallons", "Pints", "Ounce", "Cubic foot","EngNotation", "Quit"};
        int setSelection = showOptionDialog(null, "Convert " + getCalcInput() +" litres to",
                "Volume converter", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null,
                option1, option1[2]);

        switch(setSelection) {
            case 0:
                f.LitresToGallons(getCalcInput());
                break;
            case 1:
                f.LitresToPints(getCalcInput());
                break;
            case 2:
                f.LitresToOunces(getCalcInput());
                break;
            case 3:
                f.LitresToCubicFoot(getCalcInput());
                break;
            case 4:
                f.LitresToEng(getCalcInput());
                break;
            case 5:
                this.setVisible(false);
                break;
            default:
                showMessageDialog(null,"Something Went wrong and Event has been log",
                        "Inane warning",WARNING_MESSAGE);
        }
    }
}
