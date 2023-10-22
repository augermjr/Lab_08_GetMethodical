import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String head = in.nextLine();
        SafeInput.prettyHeader(head);
    }
}
