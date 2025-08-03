public class Bed {
    private double  height;
    private  int pillows;
    private String SheetsColor;

    public Bed (double height, int pillows, String SheetsColor) {
        this.height = height;
        this.pillows = pillows;
        this.SheetsColor = SheetsColor;
    }
    public Bed (double height,  String SheetsColor) {
        this.height = height;
        this.SheetsColor = SheetsColor;
        this.pillows = 1;
    }
    public double getHeight() {
        return height;
    }
    public int getPillows() {
        return pillows;
    }
    public String getSheetsColor() {
        return SheetsColor;
    }
}
