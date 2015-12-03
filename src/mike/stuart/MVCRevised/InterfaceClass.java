package mike.stuart.MVCRevised;

/**
 * Created by Mike on 11/25/2015.
 */
public class InterfaceClass {
    public static void main(String[] args){
        ViewClass view = new ViewClass();
        view.setVisible(true);
        ModelClass model = new ModelClass();
        ControlClass control = new ControlClass(view, model);
    }
}
