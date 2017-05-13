import java.util.Scanner;

/**
 * Created by Vilcho on 5/14/2017.
 */
public class ex_p05_IntegerToBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Long.parseLong(scanner.nextLine());
        int toBase = Integer.parseInt(scanner.nextLine());

        System.out.println(IntegerToBase(number, toBase));
    }

    static String IntegerToBase(long number, int toBase) {
        String result = "";
        while (number > 0) {
            int remainder = (int) (number % (long) toBase);
            result = String.valueOf(remainder) + result;
            number = number / toBase;
        }
        return result;
    }

}
