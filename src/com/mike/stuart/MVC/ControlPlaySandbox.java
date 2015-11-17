package com.mike.stuart.MVC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/17/2015.
 */
public class ControlPlaySandbox {
    private ViewPlaySandbox view;
    private ModelPlaySandbox model;

    ControlPlaySandbox(ViewPlaySandbox view, ModelPlaySandbox model){
        this.view = view;
        this.model = model;

        this.view.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try {
                int number1 = view.getNumber1();
                int number2 = view.getNumber2();

                view.setCalcSolution(model.addTwoNumbers(number1, number2));

            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
