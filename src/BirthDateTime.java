import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxDay = 0;
        int year = SafeInput.getRangedInt(in, "Input birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Input birth month", 1, 12);

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDay = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDay = 30;
                break;
            case 2:
                if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 ==0))
                    maxDay = 29;
                else
                    maxDay = 28;
                break;
            default:
                System.out.println("Error invalid input");
                break;
        }
        int day = SafeInput.getRangedInt(in, "Input birth day", 1, maxDay);

        int hour = SafeInput.getRangedInt(in, "Input birth hour", 1, 24);

        int minute = SafeInput.getRangedInt(in, "Input birth minute", 1, 59);

        System.out.printf("You were born %d-%d-%d at %d:%d", year, month, day, hour, minute);
    }
}
