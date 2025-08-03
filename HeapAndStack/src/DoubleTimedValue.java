public class DoubleTimedValue {
    private double value;
    private double time;

    public DoubleTimedValue(double value, double time) {
        this.value = value;
        this.time = time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
