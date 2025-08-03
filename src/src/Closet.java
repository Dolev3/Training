public class Closet {
    private Shirt[] Shirts;

    public Closet(Shirt[] Shirts) {
        this.Shirts = Shirts;
    }

    public Shirt[] getShirts() {
        return Shirts;
    }

    public Shirt[] getShirtsBySize(Shirt[] shirts, int size) {
        int Size = 0;
        Shirt[] shirtsBySize  = new Shirt[Size];
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].getSize() == size) {
                shirtsBySize[Size] = shirts[i];
                Size++;
            }
        }
        return shirtsBySize;
    }
}
