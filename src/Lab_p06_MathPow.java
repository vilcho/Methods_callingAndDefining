import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p06_MathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        NumberFormat formatter = new DecimalFormat("######.########");
        System.out.println(formatter.format(raiseToPower(num, power)));

    }
    static double raiseToPower (double base, int pow){
        double result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= base;
        }
        return result;
    }
}
