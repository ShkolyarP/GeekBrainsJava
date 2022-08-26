package HomeWork8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    private JTextField inputField;
    private double num1 = 0;
    private double num2 = 0;
    private double result = 0;

    private String operation;
    private boolean calc = false;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


    public ButtonListener(JTextField inputField) {

        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("=")) {
            inputField.setText("");
            switch (getOperation()) {
                case "+":
                    result = num1 + num2;
                    result = (Math.round(result * 1000.0) / 1000.0);
                    break;
                case "-":
                    result = num1 - num2;
                    result = (Math.round(result * 1000.0) / 1000.0);
                    break;
                case "x":
                    result = num1 * num2;
                    result = (Math.round(result * 1000.0) / 1000.0);
                    break;
                case "/":
                    if (num2 == 0) {
                        inputField.setText("ERROR!!!");
                        calc = true;
                        setOperation(null);
                        num1 = 0;
                        return;
                    } else {
                        result = num1 / num2;
                        result = (Math.round(result * 1000.0) / 1000.0);
                    }

            }

            inputField.setText(String.valueOf(result));
            num1 = result;
            num2 = 0;
            setOperation(null);
            calc = true;
            return;
        }

        if (btn.getText().equals("+")) {
            setOperation("+");
            inputField.setText("");
            return;
        }

        if (btn.getText().equals("-")) {
            setOperation("-");
            inputField.setText("");
            return;
        }

        if (btn.getText().equals("x")) {
            setOperation("x");
            inputField.setText("");
            return;
        }

        if (btn.getText().equals("/")) {
            setOperation("/");
            inputField.setText("");
            return;
        }
        if (!calc) {
            if (getOperation() != null) {
                inputField.setText(inputField.getText() + btn.getText());
                num2 = Double.parseDouble(inputField.getText());
            } else {

                inputField.setText(inputField.getText() + btn.getText());
                num1 = Double.parseDouble(inputField.getText());
            }
        } else {
            inputField.setText("");
            calc = false;
            if (getOperation() != null) {
                inputField.setText(inputField.getText() + btn.getText());
                num2 = Double.parseDouble(inputField.getText());
            } else {

                inputField.setText(inputField.getText() + btn.getText());
                num1 = Double.parseDouble(inputField.getText());
            }

        }


    }
}
