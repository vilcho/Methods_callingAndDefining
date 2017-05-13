import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            PrintLine(1, i);
        }
        for (int i = n-1; i >=1 ; i--) {
            PrintLine(1, i);
        }

    }

    static void PrintLine(int start, int end) {
        String newLine = "";
        for (int i = start; i <= end ; i++) {
            newLine += " " + i;
        }
        System.out.println(newLine + " ");
    }
}
