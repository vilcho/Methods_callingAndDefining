import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Vilcho on 5/13/2017.
 */
public class Lab_p05_CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        NumberFormat formatter = new DecimalFormat("######.########");
        double theArea = AreaOfTriangle(base, height);

        System.out.println(formatter.format(theArea));
    }

    static double AreaOfTriangle(double a, double h) {
        double area = a*h/2;
        return area;
    }
}
