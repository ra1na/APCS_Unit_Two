import java.util.Random;
import java.util.Scanner;

//math.random *  number of numbers you want, biggest minus small - 1 + lowest number
public class EmailGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(99);
        System.out.println("Please enter your first name");
        String fName = scan.nextLine();
        System.out.println("Please enter your last name");
        String lName = scan.nextLine();
        String user1 = makeUsername(fName, lName, num);
        System.out.println("Please enter your email provider");
        String mailProvider = scan.nextLine();
        String user1Email = makeEmail(user1, mailProvider);
        System.out.println("Your email is " + user1Email);
    }

    static String makeUsername(String firstName, String lastName, String randNum) {
        char initial = firstName.charAt(0);
        int num;
        String userName = initial + lastName + num;
        return userName;
    }

    static String makeEmail(String userName, String provider) {
        String email = userName + "@" + provider;
        return email;
    }


}
