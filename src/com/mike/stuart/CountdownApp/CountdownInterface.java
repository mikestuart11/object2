package com.mike.stuart.CountdownApp;

/**
 * Created by Mike on 11/30/2015.
 */
public class CountdownInterface {
    public static void main(String[] args){
        CountdownView view = new CountdownView();
        view.setVisible(true);
        CountdownController control = new CountdownController(view);
    }
}
