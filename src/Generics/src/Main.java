public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);


        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }

    public <T> void arrayListPrint(ArrayList<T> list) {
        for (int i = 0; i < list.getCurrentSize(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}