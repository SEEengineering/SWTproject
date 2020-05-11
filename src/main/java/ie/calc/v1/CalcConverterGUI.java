package ie.calc.v1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcConverterGUI extends JFrame {

    private JButton enterButton;
    private JButton backSpaceButton;
    private JButton decimalPointButton;
    private JButton cancelButton;
    private JButton[] numButtonArray;
    private JRadioButton[] selectionRadioButton;
    private JTextField inputTextField;

    public CalcConverterGUI() {
        initComponents();
        selectionRadioButton[0].setEnabled(false);
        enterButton.setEnabled(false);
    }

    public void enable() {
        inputTextField.setEnabled(true);
        selectionRadioButton[0].setEnabled(false);
        selectionRadioButton[1].setEnabled(true);
        cancelButton.setEnabled(true);
        for (JButton jButton : numButtonArray) {
            jButton.setEnabled(true);
        }
        backSpaceButton.setEnabled(true);
        decimalPointButton.setEnabled(true);
        selectionRadioButton[3].setEnabled(true);
        selectionRadioButton[4].setEnabled(true);
        selectionRadioButton[5].setEnabled(true);
    }

    public void disable() {
        inputTextField.setEnabled(false);
        selectionRadioButton[0].setEnabled(true);
        selectionRadioButton[1].setEnabled(false);
        enterButton.setEnabled(false);
        cancelButton.setEnabled(false);
        for (JButton jButton : numButtonArray) {
            jButton.setEnabled(false);
        }
        backSpaceButton.setEnabled(false);
        decimalPointButton.setEnabled(false);
        selectionRadioButton[3].setEnabled(false);
        selectionRadioButton[4].setEnabled(false);
        selectionRadioButton[5].setEnabled(false);
    }

    private void initComponents() {

        ButtonGroup buttonGroup1 = new ButtonGroup();
        ButtonGroup buttonGroup2 = new ButtonGroup();
        inputTextField = new JTextField();
        numButtonArray = new JButton[10];
        selectionRadioButton = new JRadioButton[6];
        String[] radioButtonName = {"ON","OFF","Currency(Euro)","Mass(Grams)","Distance(Km)","Volume(Litres)"};
        for(int ii = 0; ii < numButtonArray.length; ii++) {
            numButtonArray[ii] = new JButton(Integer.toString(ii));
            numButtonArray[ii].setFont(new Font("Tahoma", 1, 11));
            final int finalIi = ii;
            numButtonArray[ii].addActionListener(evt -> buttonArrayActionPerformed(evt, Integer.toString(finalIi)));
        }
        for(int ii = 0; ii < selectionRadioButton.length; ii++) {
            selectionRadioButton[ii] = new JRadioButton(radioButtonName[ii]);
            selectionRadioButton[ii].setFont(new Font("Tahoma", 1, 11));
            final String finalSi = radioButtonName[ii];
            selectionRadioButton[ii].addActionListener(evt -> selectionButton(evt, finalSi));
        }
        buttonGroup1.add(selectionRadioButton[0]);
        buttonGroup1.add(selectionRadioButton[1]);
        buttonGroup2.add(selectionRadioButton[2]);
        buttonGroup2.add(selectionRadioButton[3]);
        buttonGroup2.add(selectionRadioButton[4]);
        buttonGroup2.add(selectionRadioButton[5]);

        enterButton = new JButton();
        cancelButton = new JButton();
        backSpaceButton = new JButton();
        decimalPointButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("CalcConverter");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        inputTextField.setEditable(false);
        inputTextField.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        inputTextField.setHorizontalAlignment(JTextField.RIGHT);

        enterButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelButton.setText("C");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        backSpaceButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backSpaceButton.setText("<---");
        backSpaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        decimalPointButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        decimalPointButton.setText(".");
        decimalPointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(inputTextField)
                                        .addComponent(cancelButton, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(selectionRadioButton[1])
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backSpaceButton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(selectionRadioButton[0])
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(selectionRadioButton[3])
                                                                        .addComponent(selectionRadioButton[2])
                                                                        .addComponent(selectionRadioButton[4])
                                                                        .addComponent(selectionRadioButton[5])))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(numButtonArray[7], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(numButtonArray[8], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(numButtonArray[9], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(numButtonArray[4], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(numButtonArray[5], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(numButtonArray[6], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(numButtonArray[1], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(numButtonArray[2], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(numButtonArray[0], GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(decimalPointButton, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(enterButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(numButtonArray[3], GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(inputTextField, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectionRadioButton[0])
                                        .addComponent(selectionRadioButton[2]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectionRadioButton[3])
                                        .addComponent(backSpaceButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectionRadioButton[1]))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectionRadioButton[4])
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(selectionRadioButton[5])
                                        .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(numButtonArray[7], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numButtonArray[9], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numButtonArray[8], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(numButtonArray[4], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numButtonArray[5], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numButtonArray[6], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(numButtonArray[3], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numButtonArray[2], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numButtonArray[1], GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(numButtonArray[0], GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(enterButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(decimalPointButton, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {
        if(selectionRadioButton[2].isSelected()) {
            new CurrencyConverter(inputTextField.getText()).showUI();
        } else if (selectionRadioButton[3].isSelected()) {
            new MassConverter(inputTextField.getText()).showUI();
        } else if (selectionRadioButton[4].isSelected()) {
            new DistanceConverter(inputTextField.getText()).showUI();
        } else if (selectionRadioButton[5].isSelected()) {
            new VolumeConverter(inputTextField.getText()).showUI();
        }
    }

    private void buttonArrayActionPerformed(ActionEvent evt, String buttonID) {
        inputTextField.setText(inputTextField.getText() + buttonID);
    }

    private void selectionButton(ActionEvent evt, String radioButtonID) {
        switch (radioButtonID) {
            case "ON":
                enable();
                break;
            case "OFF":
                disable();
                break;
            case "Currency(Euro)":
            case "Volume(Litres)":
            case "Mass(Grams)":
            case "Distance(Km)":
                enterButton.setEnabled(true);
                break;
        }
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        inputTextField.setText("");
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
        int length = inputTextField.getText().length();
        int num = inputTextField.getText().length() - 1;
        String store;

        if(length > 0) {
            StringBuilder back = new StringBuilder(inputTextField.getText());
            back.deleteCharAt(num);
            store=back.toString();
            inputTextField.setText(store);
        }
    }

    private void dpActionPerformed(java.awt.event.ActionEvent evt) {
        inputTextField.setText(inputTextField.getText() + ".");
    }
}
