import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNum = SafeInput.getRegExString(in,"UC M number", "^(M|m)\\d{5}$");
        String menu = SafeInput.getRegExString(in,"Menu ([O]pen, [S]ave, [V]iew, [Q]uit)", "^[OoSsVvQq]$");
        System.out.printf("SSN: %s\nUC M number: %s\nMenu option: %s", ssn, mNum, menu);
    }
}
