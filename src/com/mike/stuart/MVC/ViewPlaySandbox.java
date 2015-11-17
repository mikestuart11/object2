package com.mike.stuart.MVC;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/17/2015.
 */
public class ViewPlaySandbox extends JFrame{

    private JTextField number1 = new JTextField(10);
    private JLabel additionalLabel = new JLabel("+");
    private JTextField number2 = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    ViewPlaySandbox(){
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 100);

        calcPanel.add(number1);
        calcPanel.add(additionalLabel);
        calcPanel.add(number2);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getNumber1() {
        return Integer.parseInt(number1.getText());
    }

    public int getNumber2() {
        return Integer.parseInt(number2.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }
}
