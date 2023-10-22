import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean haveItem = true;
        double total = 0;
        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Input your item price", 0.50, 10.00);
            total += itemPrice;
            haveItem = SafeInput.getYNConfirm(in, "Item to scan?");
        } while(haveItem);
        System.out.printf("Total cost: $%02.2f", total);
    }
}
