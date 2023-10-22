import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = SafeInput.getUserName(in);
        System.out.println(name);
    }
}
