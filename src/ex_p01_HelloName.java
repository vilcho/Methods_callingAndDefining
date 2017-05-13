import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class ex_p01_HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        getName(name);
    }

    static void getName(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
