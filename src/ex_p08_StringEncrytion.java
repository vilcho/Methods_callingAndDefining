import java.util.Scanner;

/**
 * Created by Vilcho on 5/14/2017.
 */
public class ex_p08_StringEncrytion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String encryptedString = "";

        for (int i = 0; i < n; i++) {
            String letter = scanner.nextLine();

            encryptedString += encrypt(letter) + "%n");
        }



    }

    static String encrypt(char letter) {
        String encryptedLetter = "";

        int letterASCIInumber = (int) letter;

        String letterASCIInumberToStr = String.valueOf(letterASCIInumber);
        int lengthOfASCII = letterASCIInumberToStr.length();
        if (lengthOfASCII < 3) {
            encryptedLetter += letterASCIInumberToStr;
        } else if (lengthOfASCII < 4) {
            int lastDigit = letterASCIInumber % 10;
            int firstDigit = letterASCIInumber / 100;
            encryptedLetter += String.valueOf(firstDigit) + String.valueOf(lastDigit);
        }
        return encryptedLetter;
    }
}
