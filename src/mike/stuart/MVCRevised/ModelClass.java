package mike.stuart.MVCRevised;

import mike.stuart.JavaBeans.CarBean;

import java.util.ArrayList;

/**
 * Created by Mike on 11/25/2015.
 */
public class ModelClass {

    public ModelClass(){

    }

    private ArrayList carBeanArray = new ArrayList();

    public void saveCarBeans(CarBean newCarBean){
        carBeanArray.add(newCarBean);

        System.out.println(carBeanArray);
    }
}
