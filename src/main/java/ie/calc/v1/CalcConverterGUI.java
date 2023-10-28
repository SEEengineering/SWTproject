import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcConverterGUI extends JFrame {
    // Constants
    private static final int BUTTON_COUNT = 10;
    private static final int RADIO_BUTTON_COUNT = 6;

    private JButton enterButton;
    private JButton backSpaceButton;
    private JButton decimalPointButton;
    private JButton cancelButton;
    private JButton[] numButtonArray;
    private JRadioButton[] selectionRadioButton;
    private JTextField inputTextField;

    public CalcConverterGUI() {
        initComponents();
        disableSelectionRadioButtons();
        enterButton.setEnabled(false);
    }

    // Other methods and listeners...

    // Method to enable selection radio buttons
    private void enableSelectionRadioButtons() {
        for (JRadioButton radioButton : selectionRadioButton) {
            radioButton.setEnabled(true);
        }
    }

    // Method to disable selection radio buttons
    private void disableSelectionRadioButtons() {
        for (JRadioButton radioButton : selectionRadioButton) {
            radioButton.setEnabled(false);
        }
    }
    
    // ... (other methods and listeners)

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalcConverterGUI calcConverter = new CalcConverterGUI();
            calcConverter.setVisible(true);
        });
    }
}
