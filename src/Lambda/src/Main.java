import java.util.*;
public class Main {
    public static void main(String[] args) {

        Ex1 isCharInWord = (letter, word) -> (isCharInWord(letter, word));
        Ex2 smallToThePowerOfLarge = ((num1, num2) -> (smallPowerLarge(num1, num2)));
        Ex3_2 x = (Ex3_1 t, int y) -> t.ex1_1(y);
    }
    public static boolean isCharInWord (char letter, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public static double smallPowerLarge(int num1, int num2) {
        if (num1 > num2) {
            return Math.pow(num2, num1);
        }
        else {
            return Math.pow(num1, num2);
        }
    }

}