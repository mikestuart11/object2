package mike.stuart.CountdownApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Mike on 11/30/2015.
 */
public class CountdownController {
    private CountdownView view;

    public CountdownController(CountdownView view) {
        this.view = view;
        this.view.addCountdownGoListener(new MakeCountdownGoListener());
    }

    public CountdownController(){

    }

    class MakeCountdownGoListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            Integer hours = view.getHoursText();
            Integer minutes = view.getMinutesText();
            Integer seconds = view.getSecondsText();

            Integer totalSeconds = calculateSeconds(hours, minutes, seconds);
            Boolean timerDone = timerCountdown(totalSeconds);
            alarm(timerDone);
        }
    }

    public Integer calculateSeconds(Integer hours, Integer minutes, Integer seconds) {
        Integer totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        return totalSeconds;
    }

    public boolean timerCountdown(Integer totalSeconds){
        while (totalSeconds != 0) {
            totalSeconds--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return true;
    }

    public void alarm(Boolean finished) {
        if (finished == true) {
            System.out.println("The timer is done!!");
        } else {
            System.out.println("Something went wrong.");
        }
    }
}
