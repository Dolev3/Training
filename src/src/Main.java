import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            ex1(new ArrayList<>());
        }

        public static void ex1(List <Integer> untilQ) {

        String  num = sc.next();

        while (!Objects.equals(num, "q")) {
            num = sc.next();
            try {
                untilQ.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {

            }
          }
        }

    }