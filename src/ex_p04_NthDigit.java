import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class ex_p04_NthDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Long.parseLong(scanner.nextLine());
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println(FinfNthDigit(number, index));
    }


    static char FinfNthDigit(long number, int index) {
        String numToString = String.valueOf(number);

        int numberLength = numToString.length();
        int numberLengthMinusIndex = numberLength - index;

        char currentChar = ' ';

        while (numberLength > numberLengthMinusIndex) {
            number /= 10;
            numberLength -= 1;
            currentChar = numToString.charAt(numberLength);

        }
        return currentChar;

    }
}
