import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p04_DrawAFilledSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        PrintHeader(n*2);
        for (int i = 1; i <=n-2; i++) {
            PrintMiddleRow(n-1);
        }
        PrintHeader(n*2);
    }

    static void PrintMiddleRow(int i) {
         System.out.println("-" + repeatStr("\\/", i) + "-");
        }

    static void PrintHeader(int i) {
        System.out.println(repeatStr("-", i));
    }

    public static String repeatStr (String str, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count ; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

}
