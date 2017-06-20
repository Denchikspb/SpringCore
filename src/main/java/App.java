/**
 * Created by cherepanov on 20.06.2017.
 */
public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App() {
    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getName());

        eventLogger.logEvent(message);
    }
}
