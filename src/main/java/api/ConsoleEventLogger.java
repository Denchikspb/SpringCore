package api;

import model.Event;
import model.EventLogger;

/**
 * Created by Denis on 20.06.2017.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event){
        System.out.println(event);
    }
}
