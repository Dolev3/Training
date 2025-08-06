public class Bed {
    private double  height;
    private  int pillows;
    private String sheetsColor;
    private final int BED_PRICE;

    public Bed (double height, int pillows, String sheetsColor, int BED_PRICE) {
        this.height = height;
        this.pillows = pillows;
        this.sheetsColor = sheetsColor;
        this.BED_PRICE = BED_PRICE;
    }
    public Bed (double height,  String sheetsColor) {
        this(height,1,sheetsColor,100);
    }
    public int getBED_PRICE() {
        return BED_PRICE;
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
