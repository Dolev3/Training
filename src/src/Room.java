public class Room {

    private  Closet closet;
    private  Bed bed;

    public Room (Closet closet, Bed bed) {
        this.closet = closet;
        this.bed = bed;
    }

    public Room (Bed bed, Shirt[] shirts) {
      Closet closet1 = new Closet(shirts);
        new Room(closet1, bed);
    }
    public Closet getCloset() {
        return closet;
    }

    public Bed getBed() {
        return bed;
    }

}
