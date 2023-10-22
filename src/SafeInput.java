import java.util.Scanner;
public class SafeInput {
    /*
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getUserName(Scanner pipe) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        String trash = "";
        do {
            trash = "loop";
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
            }
            else {
                trash = pipe.nextLine();
                System.out.print("Invalid input. Try again.\n");
            }
        } while(trash.length() != 0);
        return retInt;
        }
    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0;
        String trash = "";
        do {
            trash = "loop";
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
            }
            else {
                trash = pipe.nextLine();
                System.out.print("Invalid input. Try again.\n");
            }
        } while(trash.length() != 0);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        String trash = "";
        do {
            trash = "loop";
            System.out.print("\n" + prompt + " [" + low + "--" + high + "]: " );
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                if (retInt <= high && retInt >= low){
                    trash = "";
                }
                else {
                    System.out.printf("\nInput is out of range[%d - %d]. Try again.", low, high);
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.print("Invalid input. Try again.");
            }
        } while(trash.length() != 0);
        return retInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        String trash = "";
        do {
            trash = "loop";
            System.out.print("\n" + prompt + " [" + low + "--" + high + "]: " );
            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                if (retDouble <= high && retDouble >= low){
                    trash = "";
                }
                else {
                    System.out.printf("\nInput is out of range[%02.2f - %02.2f]. Try again.", low, high);
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.print("Invalid input. Try again.");
            }
        } while(trash.length() != 0);
        return retDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean retBool = true;
        boolean gotValue = false;
        do {
            System.out.print("\n" + prompt + "[Y/N]: ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                retBool = true;
                gotValue = true;
            }
            else if (response.equalsIgnoreCase("N")){
                retBool = false;
                gotValue = true;
            }
            else {
                System.out.print("Invalid input. Try again.\n");
            }
        } while(!gotValue);
        return retBool;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String response = "";
        boolean gotValue = false;
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regExPattern)) {
                gotValue = true;
            }
            else {
                System.out.printf("Invalid input.\nTry again with a response that matches the pattern " + regExPattern);
            }
        } while(!gotValue);
        return response;
    }

    public static void prettyHeader(String msg) {
        boolean gotValue = false;
        int lineLen = 60;
        int spacing = ((lineLen - msg.length()) / 2);
        do {
            if (msg.length() > 0 && msg.length() <= 60)
            {
                gotValue = true;
            }
            else {
                System.out.printf("\nInvalid input. Title must be 1-60 characters.");
                gotValue = false;
            }
        } while(!gotValue);
        for(int i = 1; i <=66-1; i++) {
            for(int n = 1; n <= 1 ; n++) {
                System.out.print("*");
            }
            System.out.print("");
        }
        for(int i = 1; i <= 1; i++) {
            for(int n = 1; n <= 1 ; n++) {
                System.out.print("\n***");
            }
            System.out.print("");
        }
        for (int i = 0; i < spacing; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spacing; i++) {
            System.out.print(" ");
        }
        for(int i = 1; i <= 1; i++) {
            for(int n = 1; n <= 1 ; n++) {
                System.out.print("***\n");
            }
            System.out.print("");
        }
        for(int i = 1; i <=66-1; i++) {
            for(int n = 1; n <= 1 ; n++) {
                System.out.print("*");
            }
            System.out.print("");
        }

    }
}

