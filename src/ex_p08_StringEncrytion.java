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

            char charLetter = letter.charAt(0);

            encryptedString += encrypt(charLetter);
        }
        System.out.println(encryptedString);



    }

    static String encrypt(char letter) {
        String encryptedLetter = "";

        int letterAsASCIIdecimalNumber = (int) letter;

        String letterASCIInumberToStr = String.valueOf(letterAsASCIIdecimalNumber);
        int lengthOfASCII = letterASCIInumberToStr.length();
        int lastDigit = 0;
        int firstDigit = 0;

        if (lengthOfASCII == 2){
            lastDigit = letterAsASCIIdecimalNumber % 10;
            firstDigit = letterAsASCIIdecimalNumber / 10;
            encryptedLetter += letterASCIInumberToStr;
        } else if (lengthOfASCII == 3){
            lastDigit = letterAsASCIIdecimalNumber % 10;
            firstDigit = letterAsASCIIdecimalNumber /100;
            encryptedLetter += String.valueOf(firstDigit) + String.valueOf(lastDigit);
        }
        int firstSymbolFromEncryption = letterAsASCIIdecimalNumber + lastDigit;
        char charFirstSymbolFromEncryption = (char) firstSymbolFromEncryption;
        int lastSymbolFromEncryption = letterAsASCIIdecimalNumber - firstDigit;
        char charLastSymbolFromEncryption = (char) lastSymbolFromEncryption;

        encryptedLetter = charFirstSymbolFromEncryption + encryptedLetter + charLastSymbolFromEncryption;

        return encryptedLetter;
    }
}
