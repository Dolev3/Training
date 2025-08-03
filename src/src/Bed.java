public class Bed {
    private double  height;
    private  int pillows;
    private String SheetsColor;
    private int price;

    public Bed (double height, int pillows, String SheetsColor, int price) {
        this.height = height;
        this.pillows = pillows;
        this.SheetsColor = SheetsColor;
        this.price = price;
    }
    public Bed (double height,  String SheetsColor) {
        this.height = height;
        this.SheetsColor = SheetsColor;
        this.pillows = 1;
        this.price = 100;
    }
    public int getPrice() {
        return price;
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
    public void setSheetsColor(String SheetsColor) {
        this.SheetsColor = SheetsColor;
    }
}
