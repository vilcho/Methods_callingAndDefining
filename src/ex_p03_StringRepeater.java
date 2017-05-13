import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class ex_p03_StringRepeater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(str, count));
    }

    static String repeatString(String str, int count) {
        String repeatedString = "";
        for (int i = 0; i < count; i++) {
            repeatedString += str;
        }
        return repeatedString;
    }
}
