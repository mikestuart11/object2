package com.mike.stuart.MVC;

/**
 * Created by Mike on 11/17/2015.
 */
public class InterfacePlaySandbox {
    public static void main(String[] args){

        ViewPlaySandbox view = new ViewPlaySandbox();
        view.setVisible(true);
        ModelPlaySandbox model = new ModelPlaySandbox();
        ControlPlaySandbox control = new ControlPlaySandbox(view, model);
    }
}
