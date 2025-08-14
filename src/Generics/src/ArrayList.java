public class ArrayList <T> {

    private int currentSize;
    private Object[] arrayList;
    private final int DEFAULT_SIZE = 10;

    public ArrayList() {
        this.currentSize = 0;
        this.arrayList = new Object[DEFAULT_SIZE];
    }

    public void add(T added) {
        if (currentSize == arrayList.length) {
            Object [] arrayList2 = new Object[arrayList.length+ DEFAULT_SIZE];
            for (int i = 0; i < arrayList.length; i++) {
                arrayList2[i] = arrayList[i];
            }
            arrayList = arrayList2;
        }
        arrayList[currentSize] = added;
        currentSize++;
    }

    public T get(int place) {
        return (T)arrayList[place];
    }

    public void set(int place, Object newValue) {
        arrayList[place] = newValue;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}
