import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class ex_p02_MinMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallerBetweenFirstTwo = GetMin(num1, num2);
        int smallerBetweenSmallerAndThird = GetMin(smallerBetweenFirstTwo, num3);

        System.out.println(smallerBetweenSmallerAndThird);

    }

    static int GetMin(int a, int b) {
        int smallerNum = 0;
        if (a<b){
            smallerNum = a;
        } else if (a>b){
            smallerNum = b;
        }
        return smallerNum;
    }
}
