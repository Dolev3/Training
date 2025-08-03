public class Bed {
    private double  height;
    private  int pillows;
    private String sheetsColor;
    private final int BED_PRICE;

    public Bed (double height, int pillows, String SheetsColor, int BED_PRICE) {
        this.height = height;
        this.pillows = pillows;
        this.sheetsColor = SheetsColor;
        this.BED_PRICE = BED_PRICE;
    }
    public Bed (double height,  String SheetsColor) {
        this(height,1,SheetsColor,100);
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
    public void setSheetsColor(String SheetsColor) {
        this.sheetsColor = SheetsColor;
    }
}
