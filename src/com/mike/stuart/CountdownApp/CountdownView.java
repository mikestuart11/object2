package com.mike.stuart.CountdownApp;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/30/2015.
 */
public class CountdownView extends JFrame {

    private JLabel enterTime = new JLabel("Please enter a time: ");

    private JLabel hoursLabel = new JLabel("Hours:");
    private JTextField hoursTextField = new JTextField(4);

    private JLabel minutesLabel = new JLabel("Minutes: ");
    private JTextField minutesTextField = new JTextField(4);

    private JLabel secondsLabel = new JLabel("Seconds: ");
    private JTextField secondsTextField = new JTextField(4);

    private JButton countdownGoButton = new JButton("GO");

    public CountdownView() {
        JPanel countdownPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 100);

        countdownPanel.add(enterTime);
        countdownPanel.add(hoursLabel);
        countdownPanel.add(hoursTextField);
        countdownPanel.add(minutesLabel);
        countdownPanel.add(minutesTextField);
        countdownPanel.add(secondsLabel);
        countdownPanel.add(secondsTextField);

        countdownPanel.add(countdownGoButton);

        this.add(countdownPanel);
    }

    public Integer getHoursText(){
        return Integer.parseInt(hoursTextField.getText());
    }

    public Integer getMinutesText(){
        return Integer.parseInt(minutesTextField.getText());
    }

    public Integer getSecondsText(){
        return Integer.parseInt(secondsTextField.getText());
    }

    void addCountdownGoListener(ActionListener listenForCountdownGoButton) {
        countdownGoButton.addActionListener(listenForCountdownGoButton);
    }

}
