public class Util {

    protected static Shirt[] addShirt (Shirt[] shirts, Shirt add) {
        Shirt[] newShirts = new Shirt[shirts.length + 1];
        for (int i = 0; i < shirts.length; i++) {
            newShirts[i] = shirts[i];
        }
        newShirts[shirts.length+1] = add;
        return newShirts;
    }

    protected static boolean tolerance(double wanted, double num, double tolerance) {

        return (num >= wanted - tolerance) && (num <= wanted + tolerance);
    }
}
