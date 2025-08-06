public class Bed {
    private double  height;
    private  int pillows;
    private String sheetsColor;
    private final int price;
    private static final int DEFAULT_BED_PRICE = 100;

    public Bed (double height, int pillows, String sheetsColor, int price) {
        this.height = height;
        this.pillows = pillows;
        this.sheetsColor = sheetsColor;
        this.price = price;
    }
    public Bed (double height,  String sheetsColor) {
        this(height,1,sheetsColor,DEFAULT_BED_PRICE);
    }
    public int getBED_PRICE() {
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
    public void setSheetsColor(String sheetsColor) {
        this.sheetsColor = sheetsColor;
    }
}
