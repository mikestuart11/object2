import java.util.EnumMap;
import java.util.Iterator;

/**
 * Created by Mike on 9/24/2015.
 */
public class enumMapSandbox {

    public enum STATE {
        NEW, RUNNING, WAITING, FINISHED, HOPING
    }

    public static void main(String[] args) {

        /*happy path -------------------------------------------------------------------------------------------------*/
        EnumMap<STATE, String> stateMap = new EnumMap<STATE, String>(STATE.class);

        stateMap.put(STATE.RUNNING, "Program is running");
        stateMap.put(STATE.WAITING, "Program is waiting");
        stateMap.put(STATE.NEW, "Program has just created");
        stateMap.put(STATE.FINISHED, "Program has finished");

        System.out.println("EnumMap: " + stateMap);

        System.out.println("EnumMap key : " + STATE.NEW + " value: " + stateMap.get(STATE.NEW));

        Iterator<STATE> enumKeySet = stateMap.keySet().iterator();
        while (enumKeySet.hasNext()) {
            STATE currentState = enumKeySet.next();
            System.out.println("key : " + currentState + " value : " + stateMap.get(currentState));

        }

        /*nasty path -------------------------------------------------------------------------------------------------
        * putting in null for a key */

        try {
            stateMap.put(null, "Program is hoping.");
            System.out.println("EnumMap: " + stateMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
