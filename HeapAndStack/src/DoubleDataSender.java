import java.util.*;
import java.time.LocalTime;
public class DoubleDataSender {
    private final String name;
    private DoubleTimedValue doubleTimedValue;

    public DoubleDataSender(String name) {
        this.name = name;
    }
    public void update() {
        doubleTimedValue = new DoubleTimedValue(Math.random(), LocalTime.now().getSecond());
    }


    public DoubleTimedValue getDoubleTimedValue() {
        return doubleTimedValue;
    }

}
