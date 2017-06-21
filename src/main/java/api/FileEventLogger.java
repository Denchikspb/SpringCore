package api;

import model.Event;
import model.EventLogger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by cherepanov on 21.06.2017.
 */
public class FileEventLogger implements EventLogger {

    private String filename;
    private File file;

    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(file, "", true);
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public void init() throws IOException {
        this.file = new File(filename);
    }
}
