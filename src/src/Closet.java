public class Closet {
    private Shirt[] shirts;

    public Closet(Shirt[] Shirts) {
        this.shirts = Shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] getShirtsBySize(Shirt[] shirts, int size) {
        int arrSize = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize() == size) {
                arrSize++;
            }
        }
        int index = 0;
        Shirt[] shirtsBySize  = new Shirt[arrSize];
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize() == size) {
                shirtsBySize[index] = shirts[i];
                index++;
            }
        }
        return shirtsBySize;
    }

    public void addShirts(Shirt add) {
         shirts = Util.addShirt(shirts, add);
    }
}
