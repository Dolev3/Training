import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Exception runTimeException = new RuntimeException("an error occured");
        Exception indexOutOfBoundsException = new IndexOutOfBoundsException("Index out of bounds");

        try {
            //exeptions();
        } catch (Exception runTime) {
            System.err.println(runTime);
        }
        //Programm();
        //ex_3();
        ex_4(1);
        ex_5(2);
        ex_6(6);
        ex_7();
        ex_8();
    }

    public static void exeptions(Exception runTimeException, Exception indexOutOfBoundsException) throws Exception {

        indexOutOfBoundsException.getStackTrace();
        throw runTimeException;
    }

    public static void Programm() {
        try {
            int[] arr = new int[5];
            arr[6] = 7;
        } catch (RuntimeException runTimeException) {
            System.out.println("an error occured");
        }
    }

    public static void ex_3() {
        for (int i = 0; i > -1; i++) {
            int num = sc.nextInt();
            if (num == 45) {
                try {
                    throw new IllegalArgumentException();
                } catch (IllegalArgumentException runTimeException) {
                }
            }
            if (num == 100) {
                throw new RuntimeException();
            }
        }
    }

    public static void ex_4(int num) throws FileNotFoundException, BindException, AuthenticationException {
        if (num == 1) {
            throw new FileNotFoundException();
        } else if (num == 2) {
            throw new BindException();
        } else if (num == 3) {
            throw new AuthenticationException();
        }
    }

    public static void ex_5(int num) {

        try {
        ex_4(num);
        }
        catch (FileNotFoundException exception) {
            System.out.println(1);
        }
        catch (BindException exception) {
            System.out.println(2);
        }
        catch (AuthenticationException exception) {
            System.out.println(3);
        }
    }

    public static void ex_6(int num) {
        boolean bool = false;
        try {
            ex_4(num);
        }
        catch (FileNotFoundException exception) {
            System.out.println(1);
            bool = true;
        }
        catch (BindException exception) {
            System.out.println(2);
            bool = true;
        }
        catch (AuthenticationException exception) {
            System.out.println(3);
            bool = true;
        }

        if (bool == false) {
            throw new RuntimeException();
        }
    }
    public static void ex_7() {
        //להוריד את התנאי השני בפעולה הבונה כדי שיהיה שם
    }

    public static void ex_8() {
        // להפוך את זה ל > במקום >=
    }
}