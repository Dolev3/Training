public class YahliConstants {
    private static final int SHIRT_SIZE = 54;
    private static final String FAVORITE_COLOR = "Blue";
    private static final double HIGHEST_PRICE_FOR_BED = 2000;
    private static final double TOLERANCE_FOR_PRICE_OF_BED = 500;

    public static String getFavoriteColor() {
        return FAVORITE_COLOR;
    }

    public static int getShirtSize() {
        return SHIRT_SIZE;
    }

    public static double getHighestPrice(){return HIGHEST_PRICE_FOR_BED;}

    public static double getToleranceForPriceOfBed(){return TOLERANCE_FOR_PRICE_OF_BED;}
}
