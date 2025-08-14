
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add("1");
        list.add(true)

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
    }
}



}