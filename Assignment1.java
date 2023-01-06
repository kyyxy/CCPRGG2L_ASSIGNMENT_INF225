import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Email Address : ");
        String emailAdd = scan.nextLine();

        // Email address
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(emailAdd);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
        
        // Phone Number
        Pattern pattern = Pattern.compile("09\\d{9}");
        Matcher matcher = pattern.matcher(emailAdd);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}
