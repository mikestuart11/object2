package com.mike.stuart.MVCRevised;

import com.mike.stuart.JavaBeans.CarBean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/25/2015.
 */
public class ControlClass {
    private ViewClass view;
    private ModelClass model;

    public ControlClass(ViewClass view, ModelClass model){
        this.view = view;
        this.model = model;

        this.view.addMakeCarListener(new MakeCarListener());
    }

    public ControlClass(){

    }

    class MakeCarListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String carMake = view.getCarMakeText();
            String carModel = view.getCarModelText();
            Integer carYear = view.getCarYearText();

            CarBean newCarBean = new CarBean(carMake, carModel, carYear);

            model.saveCarBeans(newCarBean);
        }
    }
}
