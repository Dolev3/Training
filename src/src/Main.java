public class Main {
    public static void main(String[] args) {
        ex_15();
        ex_20();
    }

    public static void ex_20() {
        System.out.println(Util.tolerance(YahliConstants.HIGHEST_PRICE_FOR_BED,Bed.getDefaultBedPrice(),YahliConstants.TOLERANCE_FOR_PRICE_OF_BED));
    }

    public static void ex_15() {
        Shirt[] shirts = new Shirt[10];
        Closet closet = new Closet(shirts);
        Bed bed = new Bed(10, "Black");
        Room r1 = new Room(closet, bed);
        bed.setSheetsColor(YahliConstants.FAVORITE_COLOR);

        Shirt[] shirtsBySize = closet.getShirtsBySize(shirts, YahliConstants.SHIRT_SIZE);

        int count = 0;
        int index = 0;
        for (int i = 0; i < shirtsBySize.length; i++) {
        if (shirtsBySize[i].getColor().equals(YahliConstants.FAVORITE_COLOR)) {
            count++;
        }
    }
        Shirt[] shirtsBySizeAndColor = new Shirt[count];
        for (int i = 0; i < shirtsBySizeAndColor.length; i++) {
            if (shirtsBySize[i].getColor().equals(YahliConstants.FAVORITE_COLOR)) {
                shirtsBySizeAndColor[index] = shirtsBySize[i];
            }
        }
    }
}