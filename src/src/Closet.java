public class Closet {
    private Shirt[] Shirts;

    public Closet(Shirt[] Shirts) {
        this.Shirts = Shirts;
    }

    public Shirt[] getShirts() {
        return Shirts;
    }

    public Shirt[] getShirtsBySize(Shirt[] shirts, int size) {
        int arrSize = 1;
        Shirt[] shirtsBySize  = new Shirt[arrSize];
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize() == size) {
                shirtsBySize[arrSize-1] = shirts[i];
                arrSize++;
            }
        }
        return shirtsBySize;
    }

    public Shirt[] addShirts(Shirt add) {
         return Util.addShirt(Shirts, add);
    }
}
