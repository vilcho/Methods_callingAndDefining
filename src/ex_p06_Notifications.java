import java.util.Scanner;

/**
 * Created by Vilcho on 5/14/2017.
 */
public class ex_p06_Notifications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String successOrNot = "";
        String operation = "";
        String message = "";
        int code = 0;
        String allFinalMessages = "";

        for (int i = 1; i <= n; i++) {
            successOrNot = scanner.nextLine().toLowerCase();

            switch (successOrNot) {
                case "success":
                    operation = scanner.nextLine();
                    message = scanner.nextLine();
                    allFinalMessages += String.format(ShowSuccess(operation, message) + "%n");
                    break;
                case "error":
                    operation = scanner.nextLine();
                    code = Integer.parseInt(scanner.nextLine());
                    allFinalMessages += String.format(ShowError(operation, code) + "%n");
                    break;
            }
        }
        System.out.println(allFinalMessages);
    }

    static String ShowSuccess(String operation, String message) {
        String successLine1 = "";
        successLine1 = "Successfully executed " + operation + ".";
        String successLine2 = ("==============================");
        String successLine3 = "Message: " + message + ".";
        String success = String.format(successLine1 + "%n" + successLine2 + "%n" + successLine3);
        return success;
    }
    static String ShowError(String operation, int code){
        String reason = "";
        if (code >= 0 ){
            reason = "Invalid Client Data";
        } else {
            reason = "Internal System Failure";
        }
        String errorLine1 = "Error: Failed to execute " + operation + ".";
        String errorLine2 = "==============================";
        String errorLine3 = "Error Code: " + code + ".";
        String errorLine4 = "Reason: " + reason + ".";
        String error = String.format(errorLine1 + "%n" + errorLine2 + "%n" + errorLine3 + "%n" + errorLine4);
        return error;
    }
}
