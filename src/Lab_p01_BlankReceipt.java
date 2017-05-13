/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p01_BlankReceipt {
    public static void main(String[] args) {

        printReceipt();

    }

    private static void printReceipt() {
        printHeader();
        printBody();
        printFooter();
    }

    public static void printFooter() {
        System.out.println("------------------------------");
        //System.out.println("© SoftUni"); //judje-a ne go priema taka
        System.out.println("\u00A9 SoftUni");
    }

    static void printBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    private static void printHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }
}
