package mike.stuart.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Mike on 11/17/2015.
 */
public class ControlPlaySandbox {
    private ViewPlaySandbox view;
    private ModelPlaySandbox model;

    public ControlPlaySandbox(ViewPlaySandbox view, ModelPlaySandbox model){
        this.view = view;
        this.model = model;

        this.view.addCalculateListener(new CalculateAddListener());
        this.view.addSubtractCalculateListener(new SubtractCalculateListener());
        this.view.addMultiplyCalculateListener(new MultiplyCalculateListener());
        this.view.addDivideCalculateListener(new DivideCalculateListener());
    }

    public ControlPlaySandbox(){

    }

    // function to add two numbers
    public double addTwoNumbers(){
        ArrayList newArray = model.ReturnArrayList();
        Double num1 = (Double)newArray.get(0);
        Double num2 = (Double)newArray.get(1);
        double solution = num1 + num2;
        removeUnusedElements();
        return roundNumber(solution);
    }

    // function to subtract two numbers
    public double subtractTwoNumbers(){
        ArrayList newArray = model.ReturnArrayList();
        Double num1 = (Double)newArray.get(0);
        Double num2 = (Double)newArray.get(1);
        double solution = num1 - num2;
        removeUnusedElements();
        return roundNumber(solution);
    }

    // function to multiply two numbers
    public double multiplyTwoNumbers(){
        ArrayList newArray = model.ReturnArrayList();
        Double num1 = (Double)newArray.get(0);
        Double num2 = (Double)newArray.get(1);
        double solution = num1 * num2;
        removeUnusedElements();
        return roundNumber(solution);
    }

    // function to divide two numbers
    public double divideTwoNumbers(){
        ArrayList newArray = model.ReturnArrayList();
        Double num1 = (Double)newArray.get(0);
        Double num2 = (Double)newArray.get(1);
        double solution = num1 / num2;
        removeUnusedElements();
        return roundNumber(solution);
    }

    protected void removeUnusedElements() {
        model.numbersArray.clear();
    }

    // function to round the solution before it is printed to the console
    public double roundNumber(double solution){
        Long roundedSolution = Math.round(solution);
        return roundedSolution;
    }

    class CalculateAddListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            try {
                model.saveNumbers(view.getNumber1(), view.getNumber2());
                view.setCalcSolution(addTwoNumbers());
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
    class SubtractCalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            try {
                model.saveNumbers(view.getNumber1(), view.getNumber2());

                view.setCalcSolution(subtractTwoNumbers());
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
    class MultiplyCalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            try {
                model.saveNumbers(view.getNumber1(), view.getNumber2());
                view.setCalcSolution(multiplyTwoNumbers());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    class DivideCalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            try {
                model.saveNumbers(view.getNumber1(), view.getNumber2());
                view.setCalcSolution(divideTwoNumbers());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
