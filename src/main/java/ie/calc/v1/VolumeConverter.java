package ie.calc.v1;

import javax.swing.*;

public class VolumeConverter extends JOptionPane implements DisplayUI {
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

    public void showUI() {
        CalcFunctions f = new CalcFunctions();
        Object[] option1 = {"Gallons", "Pints", "Ounce", "Cubic foot","EngNotation", "Quit"};
        int setSelection = showOptionDialog(null, "Convert " + getCalcInput() +" litres to",
                "Volume converter", YES_NO_CANCEL_OPTION, QUESTION_MESSAGE, null,
                option1, option1[2]);

        switch(setSelection) {
            case 0:
                JOptionPane.showMessageDialog(null,"Litres in Gallons: " + f.LitresToGallons(getCalcInput()) +"gallons");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Litres in Pints: " + f.LitresToPints(getCalcInput()) +"pints");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Litres in Ounces: " + f.LitresToOunces(getCalcInput()) +"ounces");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Litres in Cubic feet: " + f.LitresToCubicFoot(getCalcInput()) +"cubic feet");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Litres in engineering notation: " + f.LitresToEng(getCalcInput()));
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
