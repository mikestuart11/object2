package mike.stuart.MVC;


import java.util.ArrayList;

/**
 * Created by Mike on 11/17/2015.
 */
public class ModelPlaySandbox {

    public ModelPlaySandbox(){

    }

    protected ArrayList<Double> numbersArray = new ArrayList<>();

    public void saveNumbers(double number1, double number2){
        numbersArray.add(number1);
        numbersArray.add(number2);
        System.out.println("The numbers are: " + numbersArray);
    }

    public ArrayList ReturnArrayList(){
        return new ArrayList<Double>(numbersArray);
    }


}
