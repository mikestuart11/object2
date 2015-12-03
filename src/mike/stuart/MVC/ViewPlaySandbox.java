package mike.stuart.MVC;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/17/2015.
 */
public class ViewPlaySandbox extends JFrame{

    private JTextField number1 = new JTextField(10);
    private JLabel plusSignLabel = new JLabel("+");
    private JLabel equalSignLabel = new JLabel("=");
    private JTextField number2 = new JTextField(10);
    private JButton addCalculateButton = new JButton("Add");
    private JButton subtractCalculateButton = new JButton("Subtract");
    private JButton multiplyCalculateButton = new JButton("Multiply");
    private JButton divideCalculateButton = new JButton("Divide");
    private JTextField calcSolution = new JTextField(10);

    public ViewPlaySandbox(){
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 100);

        calcPanel.add(number1);
        calcPanel.add(plusSignLabel);
        calcPanel.add(number2);
        calcPanel.add(equalSignLabel);
        calcPanel.add(calcSolution);
        calcPanel.add(addCalculateButton);
        calcPanel.add(subtractCalculateButton);
        calcPanel.add(multiplyCalculateButton);
        calcPanel.add(divideCalculateButton);

        this.add(calcPanel);
    }

    public double getNumber1() {
        return Double.parseDouble(number1.getText());
    }

    public double getNumber2() {
        return Double.parseDouble(number2.getText());
    }

    public void setCalcSolution(Double solution) {
        calcSolution.setText(Double.toString(solution));

    }

    void addCalculateListener(ActionListener listenForCalcButton){
        addCalculateButton.addActionListener(listenForCalcButton);
    }

    void addSubtractCalculateListener(ActionListener listenForSubtractButton){
        subtractCalculateButton.addActionListener(listenForSubtractButton);
    }

    void addMultiplyCalculateListener(ActionListener listenForMultiplyButton){
        multiplyCalculateButton.addActionListener(listenForMultiplyButton);
    }

    void addDivideCalculateListener(ActionListener listenForDivideButton){
        divideCalculateButton.addActionListener(listenForDivideButton);
    }
}
