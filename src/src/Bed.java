public class Bed {
    private double  height;
    private  int pillows;
    private String sheetsColor;
    private int price;

    public Bed (double height, int pillows, String SheetsColor, int price) {
        this.height = height;
        this.pillows = pillows;
        this.sheetsColor = SheetsColor;
        this.price = price;
    }
    public Bed (double height,  String SheetsColor) {
        this(height,1,SheetsColor,100);
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
        return sheetsColor;
    }
    public void setSheetsColor(String SheetsColor) {
        this.sheetsColor = SheetsColor;
    }
}
