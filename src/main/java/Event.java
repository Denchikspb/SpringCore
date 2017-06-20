import java.text.DateFormat;
import java.util.Date;

/**
 * Created by cherepanov on 20.06.2017.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.dateFormat = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Message: " + msg + "\ndate: "
                + dateFormat.format(date);
    }
}
