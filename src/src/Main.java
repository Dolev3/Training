public class Main {
    public static void main(String[] args) {
        ex_15();
    }
    public static void ex_15() {
        Shirt [] shirts = new Shirt[10];
        Closet closet = new Closet(shirts);
        Bed bed = new Bed(10,"Black");
        Room r1 = new Room(closet, bed );
        bed.setSheetsColor(YahliConstants.getFavoriteColor());
    }
}