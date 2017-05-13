import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p02_SigneOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        PrintSign(n);
    }

    static void PrintSign(int number) {
        if (number>0){
            System.out.printf("The number %d is positive.", number);
        } else if (number<0){
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
