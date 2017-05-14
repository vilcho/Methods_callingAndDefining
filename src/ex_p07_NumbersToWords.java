import java.util.Scanner;

/**
 * Created by Vilcho on 5/14/2017.
 */
public class ex_p07_NumbersToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 0;
        String allNumbersToStrings = "";

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());

            String numberToStr = String.valueOf(number);
            boolean isNumberThreeDigitsOfLength = (numberToStr.length() == 3 && number > 0) || (numberToStr.length() == 4 && number < 0);

            if (isNumberThreeDigitsOfLength) {
                allNumbersToStrings += String.format(Letterize(number) + "%n");
            } else if (number > 999) {
                allNumbersToStrings += String.format("too large" + "%n");
            } else if (number < -999) {
                allNumbersToStrings += String.format("too small" + "%n");
            }
        }
        System.out.println(allNumbersToStrings);
    }

    static String Letterize(int number) {
        String letterizedNum = "";
        // този метод работи само за трицифрени числа (т.е. от -999 до +999)

        if (number < 0) {
            letterizedNum = "minus ";
            number = Math.abs(number);
        } else {
            letterizedNum = "";
        }

        int lastDigit = number % 10;
        int tempToGetDesetici = number / 10;
        int deseticiDigit = tempToGetDesetici % 10;
        int stoticiDigit = tempToGetDesetici / 10;


        switch (stoticiDigit) {
            case 1:
                letterizedNum += "one-hundred ";
                break;
            case 2:
                letterizedNum += "two-hundred ";
                break;
            case 3:
                letterizedNum += "three-hundred ";
                break;
            case 4:
                letterizedNum += "four-hundred ";
                break;
            case 5:
                letterizedNum += "five-hundred ";
                break;
            case 6:
                letterizedNum += "six-hundred ";
                break;
            case 7:
                letterizedNum += "seven-hundred ";
                break;
            case 8:
                letterizedNum += "eight-hundred ";
                break;
            case 9:
                letterizedNum += "nine-hundred ";
                break;
        }
        if (deseticiDigit == 1) {
            String from10To19 = String.valueOf(1) + String.valueOf(lastDigit);
            int from10to19 = Integer.parseInt(from10To19);
            switch (from10to19) {
                case 10:
                    letterizedNum += "and ten";
                    break;
                case 11:
                    letterizedNum += "and eleven";
                    break;
                case 12:
                    letterizedNum += "and twelve";
                    break;
                case 13:
                    letterizedNum += "and thirteen";
                    break;
                case 14:
                    letterizedNum += "and fourteen";
                    break;
                case 15:
                    letterizedNum += "and fifteen";
                    break;
                case 16:
                    letterizedNum += "and sixteen";
                    break;
                case 17:
                    letterizedNum += "and seventeen";
                    break;
                case 18:
                    letterizedNum += "and eighteen";
                    break;
                case 19:
                    letterizedNum += "and nineteen";
                    break;
            }
        } else if (deseticiDigit != 1) {
            switch (deseticiDigit) {
                case 0:
                    if (lastDigit != 0) {
                        letterizedNum += "and ";
                    } else if (lastDigit == 0){
                        letterizedNum += "";
                    }
                    break;
                case 2:
                    letterizedNum += "and twenty ";
                    break;
                case 3:
                    letterizedNum += "and thirty ";
                    break;
                case 4:
                    letterizedNum += "and fourty ";
                    break;
                case 5:
                    letterizedNum += "and fifty ";
                    break;
                case 6:
                    letterizedNum += "and sixty ";
                    break;
                case 7:
                    letterizedNum += "and seventy ";
                    break;
                case 8:
                    letterizedNum += "and eighty ";
                    break;
                case 9:
                    letterizedNum += "and ninety ";
                    break;
            }
        }
        if (deseticiDigit != 1) {
            switch (lastDigit) {
                case 0:
                    letterizedNum = letterizedNum + "";
                    break;
                case 1:
                    letterizedNum += "one";
                    break;
                case 2:
                    letterizedNum += "two";
                    break;
                case 3:
                    letterizedNum += "three";
                    break;
                case 4:
                    letterizedNum += "four";
                    break;
                case 5:
                    letterizedNum += "five";
                    break;
                case 6:
                    letterizedNum += "six";
                    break;
                case 7:
                    letterizedNum += "seven";
                    break;
                case 8:
                    letterizedNum += "eight";
                    break;
                case 9:
                    letterizedNum += "nine";
                    break;
            }
        }
        return letterizedNum;
    }
}
