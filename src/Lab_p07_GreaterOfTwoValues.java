import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p07_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(GetMax(num1, num2));
                break;

            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                System.out.println(GetMax(char1, char2));
                break;
            case "string":
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                System.out.println(GetMax(str1, str2));
                break;
        }
    }

    static String GetMax(String str1, String str2) {
        String biggerString = "";
        if (str1.compareTo(str2) >=1){
            biggerString = str1;
        } else if (str1.compareTo(str2) <= -1){
            biggerString = str2;
        }
        return biggerString;
    }

    static char GetMax(char char1, char char2) {
        char biggerChar = 0;
       if (char1 < char2){
           biggerChar = char2;
       } else if (char1>char2){
           biggerChar = char1;
       }
        return biggerChar;
    }

    static int GetMax(int a, int b) {
        int biggerNum = 0;
        if (a < b) {
            biggerNum = b;
        } else if (a > b) {
            biggerNum = a;
        }
        return biggerNum;
    }
}
