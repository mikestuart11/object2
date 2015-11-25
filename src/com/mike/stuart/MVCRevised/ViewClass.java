package com.mike.stuart.MVCRevised;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/25/2015.
 */
public class ViewClass extends JFrame {

    private JLabel enterCarMake = new JLabel("Please enter Make of Car: ");
    private JTextField carMake = new JTextField(15);

    private JLabel enterCarModel = new JLabel("Please enter Model of Car: ");
    private JTextField carModel = new JTextField(15);

    private JLabel enterCarYear = new JLabel("Please enter Model of Car: ");
    private JTextField carYear = new JTextField(15);

    private JButton createCarBean = new JButton("Add Car to Database");

    public ViewClass() {
        JPanel carCreationPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        carCreationPanel.add(enterCarMake);
        carCreationPanel.add(carMake);
        carCreationPanel.add(enterCarModel);
        carCreationPanel.add(carModel);
        carCreationPanel.add(enterCarYear);
        carCreationPanel.add(carYear);
        carCreationPanel.add(createCarBean);

        this.add(carCreationPanel);
    }

    public String getCarMakeText(){
        return carMake.getText();
    }

    public String getCarModelText(){
        return carModel.getText();
    }

    public Integer getCarYearText(){
        return Integer.parseInt(carYear.getText());
    }

    void addMakeCarListener(ActionListener listenForMakeCarButton) {
        createCarBean.addActionListener(listenForMakeCarButton);
    }

}
