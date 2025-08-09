public class Main {
    public static void main(String[] args) {
        ex_15();
    }
    public static void ex_15() {
        Shirt[] shirts = new Shirt[10];
        Closet closet = new Closet(shirts);
        Bed bed = new Bed(10, "Black");
        Room r1 = new Room(closet, bed);
        bed.setSheetsColor(YahliConstants.getFavoriteColor());

        Shirt[] shirtsBySize = closet.getShirtsBySize(shirts, YahliConstants.getShirtSize());

        int count = 0;
        int index = 0;
        for (int i = 0; i < shirtsBySize.length; i++) {
        if (shirtsBySize[i].getColor().equals(YahliConstants.getFavoriteColor())) {
            count++;
        }
    }
        Shirt[] shirtsBySizeAndColor = new Shirt[count];
        for (int i = 0; i < shirtsBySizeAndColor.length; i++) {
            if (shirtsBySize[i].getColor().equals(YahliConstants.getFavoriteColor())) {
                shirtsBySizeAndColor[index] = shirtsBySize[i];
            }
        }
    }
}