package com.mike.stuart.JavaBeans;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by Mike on 11/25/2015.
 */
public class CarBeans implements Serializable {
    private String carMake;
    private String carModel;
    private Integer carYear;

    public CarBeans(){

    }
    public CarBeans(String make, String model, Integer year){
        this.carMake = make;
        this.carModel = model;
        this.carYear = year;
    }
    public CarBeans(HashMap carHashMap){
        this.carMake = (String)carHashMap.get("carMake");
        this.carModel = (String)carHashMap.get("carModel");
        this.carYear = Integer.parseInt((String)carHashMap.get("carYear"));
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return "CarBeans{" +
                "carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                '}';
    }
}
